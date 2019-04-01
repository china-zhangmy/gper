package com.twins.designpattern.singleton.threadlocal;

/**
 * Created on 2019/3/10
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("Executor End");
    }

    private static class ExecutorThread implements Runnable {

        public void run() {
            System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalSingleton.getInstance());
            System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalSingleton.getInstance());
            System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalSingleton.getInstance());
            System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalSingleton.getInstance());
            System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalSingleton.getInstance());
        }
    }
}
