package com.twins.designpattern.factory.simplefactory;

import com.twins.designpattern.factory.ICourse;
import com.twins.designpattern.factory.factorymethod.ICourseFactory;
import com.twins.designpattern.factory.factorymethod.JavaCourseFactory;
import com.twins.designpattern.factory.factorymethod.PythonCourseFactory;

/**
 * Created on 2019/3/19
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

//        factory = new JavaCourseFactory();
//        course = factory.create();
//        course.record();
    }
}
