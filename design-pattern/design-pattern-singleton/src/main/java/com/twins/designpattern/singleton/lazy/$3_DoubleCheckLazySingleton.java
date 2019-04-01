package com.twins.designpattern.singleton.lazy;

/**
 * Created on 2019/3/10
 * <p>
 * 双重检查锁实现的饿汉式单例
 * <p>
 * 特征：
 * 线程安全
 * 性能适中
 */
public class $3_DoubleCheckLazySingleton {

    private static $3_DoubleCheckLazySingleton instance;

    private $3_DoubleCheckLazySingleton() {

    }

    public synchronized static $3_DoubleCheckLazySingleton getInstance() {
        if (instance == null) {
            synchronized ($3_DoubleCheckLazySingleton.class) {
                if (instance == null) {
                    instance = new $3_DoubleCheckLazySingleton();
                }
            }
        }

        return instance;
    }

}
