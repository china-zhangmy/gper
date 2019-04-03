package com.twins.designpattern.singleton.prototype.deep;

import java.util.Date;

/**
 * Created on 2019/3/11
 */
public class Monkey {

    private Date birthday;
    private int height;
    private int weight;

    public Monkey() {
        this.birthday = new Date();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
