package com.twins.designpattern.factory.simplefactory;

import com.twins.designpattern.factory.ICourse;
import com.twins.designpattern.factory.JavaCourse;

/**
 * Created on 2019/3/7
 */
public class CourseFactory {

    public ICourse create(String name) {
        if("java".equals(name)) {
            return new JavaCourse();
        } else {
            return null;
        }
    }

    public ICourse create2(String className) {
        if(!(null == className || "".equals(className))) {
            try {
                return (ICourse)Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public ICourse create3(Class<?> clazz) {
        if(!(null == clazz)) {
            try {
                return (ICourse)clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }

}
