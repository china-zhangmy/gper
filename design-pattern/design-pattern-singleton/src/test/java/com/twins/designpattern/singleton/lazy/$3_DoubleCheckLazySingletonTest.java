package com.twins.designpattern.singleton.lazy;

/**
 * Created on 2019/3/10
 */
public class $3_DoubleCheckLazySingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("Executor End");
    }

    private static class ExecutorThread implements Runnable {

        public void run() {
            $3_DoubleCheckLazySingleton instance = $3_DoubleCheckLazySingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " : " + instance);
        }
    }

}
