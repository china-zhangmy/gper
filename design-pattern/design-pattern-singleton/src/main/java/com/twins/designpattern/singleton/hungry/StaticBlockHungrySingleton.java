package com.twins.designpattern.singleton.hungry;

/**
 * Created on 2019/3/10
 */
public class StaticBlockHungrySingleton {

    private static final StaticBlockHungrySingleton INSTANCE;

    private StaticBlockHungrySingleton() {

    }

    static {
        INSTANCE = new StaticBlockHungrySingleton();
    }

    public static StaticBlockHungrySingleton getInstance() {
        return INSTANCE;
    }
}
