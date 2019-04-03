package com.twins.designpattern.singleton.prototype.deep;

/**
 * Created on 2019/3/11
 */
public class JinGuBang {

    private float height = 100;
    private float diameter = 10;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public void big() {
        this.height *= 2;
        this.diameter *= 2;
    }

    public void small() {
        this.height /= 2;
        this.diameter /= 2;
    }
}
