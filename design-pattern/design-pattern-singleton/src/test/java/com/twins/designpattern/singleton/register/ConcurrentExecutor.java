package com.twins.designpattern.singleton.register;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by Tom.
 */
public class ConcurrentExecutor {
    /**
     * @param runHandler
     * @param executeCount    发起请求总数
     * @param concurrentCount 同时并发执行的线程数
     * @throws Exception
     */
    public static void execute(final RunHandler runHandler, int executeCount, int concurrentCount) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //控制信号量，此处用于控制并发的线程数
        final Semaphore semaphore = new Semaphore(concurrentCount);
        //闭锁，可实现计数量递减
        final CountDownLatch countDownLatch = new CountDownLatch(executeCount);
        for (int i = 0; i < executeCount; i++) {
            executorService.execute(new Runnable() {
                public void run() {
                    try {
                        //执行许可——当总计未释放的许可数不超过executeCount时,则允许通行；否则，线程阻塞等待，直到获取到许可
                        semaphore.acquire();
                        runHandler.handler();
                        //释放许可
                        semaphore.release();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();//线程阻塞，直到闭锁值为0时，阻塞才释放，继续往下执行
        executorService.shutdown();
    }

    public interface RunHandler {
        void handler();
    }
}
