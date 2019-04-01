package com.twins.designpattern.singleton.hungry;

/**
 * Created on 2019/3/10
 */
public class HungrySingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("Executor End");
    }

    static class ExecutorThread implements Runnable {

        public void run() {
            HungrySingleton instance = HungrySingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " : " + instance);
        }
    }
}


