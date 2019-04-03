package com.twins.designpattern.singleton.prototype.shallow;

import java.util.ArrayList;

/**
 * Created on 2019/3/11
 */
public class PrototypeTest {

    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();

        prototype.setAge(6);
        prototype.setName("twins");
        prototype.setHobbies(new ArrayList<String>());

        ConcretePrototype concrete = (ConcretePrototype) prototype.clone();


        System.out.println("克隆对象中引用类型地址的值： " + concrete.getHobbies());
        System.out.println("原对象中的引用类型地址的值： " + prototype.getHobbies());
        System.out.println("对象地址的比较： " + (prototype.getHobbies() == concrete.getHobbies()));
    }
}
