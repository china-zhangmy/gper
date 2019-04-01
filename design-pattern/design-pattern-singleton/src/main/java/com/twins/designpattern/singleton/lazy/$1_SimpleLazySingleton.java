package com.twins.designpattern.singleton.lazy;

/**
 * Created on 2019/3/10
 * <p>
 * 简单的饿汉式单例
 * <p>
 * 特征：
 * 线程不安全
 * 性能最优
 */
public class $1_SimpleLazySingleton {

    private static $1_SimpleLazySingleton instance;

    private $1_SimpleLazySingleton() {

    }

    public static $1_SimpleLazySingleton getInstance() {
        if (instance == null) {
            instance = new $1_SimpleLazySingleton();
        }

        return instance;
    }

}
