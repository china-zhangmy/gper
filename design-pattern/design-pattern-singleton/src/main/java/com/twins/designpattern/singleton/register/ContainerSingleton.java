package com.twins.designpattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created on 2019/3/10
 * <p>
 * 容器注册式单例
 * <p>
 * 特征：
 * 懒汉式单例——被外部调用时才创建实例
 * 存在线程安全问题
 * 对象方便管理
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;

                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return obj;
            }

            return ioc.get(className);
        }
    }


}
