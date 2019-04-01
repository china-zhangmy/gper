package com.twins.designpattern.singleton.lazy;

/**
 * Created on 2019/3/10
 * <p>
 * 静态同步方法实现的饿汉式单例
 * <p>
 * 特征：
 * 线程安全
 * 性能最差（虽然JDK1.6之后对synchronized性能优化了不少，但不可避免的还是存在一定的性能问题）
 */
public class $2_SynchronizedLazySingleton {

    private static $2_SynchronizedLazySingleton instance;

    private $2_SynchronizedLazySingleton() {

    }

    public synchronized static $2_SynchronizedLazySingleton getInstance() {
        if (instance == null) {
            instance = new $2_SynchronizedLazySingleton();
        }

        return instance;
    }

}
