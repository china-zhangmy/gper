package com.twins.designpattern.singleton.lazy;

/**
 * Created on 2019/3/10
 */
public class $2_SynchronizedLazySingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("Executor End");
    }

    private static class ExecutorThread implements Runnable {

        public void run() {
            $2_SynchronizedLazySingleton instance = $2_SynchronizedLazySingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " : " + instance);
        }
    }

}
