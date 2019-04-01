package com.twins.designpattern.singleton.threadlocal;

/**
 * Created on 2019/3/10
 * <p>
 * ThreadLocal实现的单例
 * <p>
 * 特征：
 * 注册式单例（容器式）——采用Thread.ThreadLocalMap作为ThreadLocal（线程的本地变量）的缓存，ThreadLocal本身作为key而实现的注册式单例。
 * 当初次执行ThreadLocal.get()方法以初始化当前线程的本地变量缓存（Thread.ThreadLocalMap）时，定义并注册ThreadLocal的初始值
 * （ThreadLocal.initialValue()）来实现的单例。
 * 伪线程安全——线程内安全
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> INSTANCE =
            new ThreadLocal<>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance() {
        return INSTANCE.get();
    }
}
