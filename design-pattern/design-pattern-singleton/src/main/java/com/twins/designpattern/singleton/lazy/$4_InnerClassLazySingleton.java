package com.twins.designpattern.singleton.lazy;

/**
 * Created on 2019/3/10
 * <p>
 * 静态内部类实现的懒汉式单例
 * <p>
 * 特征：
 * 全程没有用到synchronized关键字
 * 性能最优（巧妙利用了静态内部类懒加载的特性——内部类LazyHolder实例化外部类的逻辑需要等到外部类方法调用时才执行，
 * 即借助于JVM底层加载内部类的执行逻辑，完美地避免了线程安全问题）
 */
public class $4_InnerClassLazySingleton {

//    private $4_InnerClassLazySingleton() {
//
//    }

    /**
     * 虽然上述构造方法私有了，但是却无法避开反射暴力性访问（强吻）
     *
     * <code>
     * Class<?> clazz = $4_InnerClassLazySingleton.class;
     * Constructor c = clazz.getDeclaredConstructor(null);
     * c.setAccessible(true); // 强吻
     * Object o1 = c.newInstance();
     * Object o2 = $4_InnerClassLazySingleton.getInstance();
     * <p>
     * System.out.println(o1 == o2); // false
     * </code>
     * <p>
     * 因此为了保证单例的实现，必须针对反射强吻采取一定的防范策略——抛异常，
     * 则调用者便会使用规范的全局访问点去访问单例。
     */
    private $4_InnerClassLazySingleton() {
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    public static final $4_InnerClassLazySingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final $4_InnerClassLazySingleton INSTANCE = new $4_InnerClassLazySingleton();
    }
}