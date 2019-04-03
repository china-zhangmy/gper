package com.twins.designpattern.singleton.prototype.shallow;

import java.util.List;

/**
 * Created on 2019/3/11
 */
public class ConcretePrototype implements Prototype {

    private int age;
    private String name;
    private List<String> hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Prototype clone() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(this.age);
        prototype.setName(this.name);
        prototype.setHobbies(this.hobbies);

        return prototype;
    }
}
