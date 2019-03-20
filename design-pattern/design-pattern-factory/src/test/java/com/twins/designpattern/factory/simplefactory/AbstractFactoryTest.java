package com.twins.designpattern.factory.simplefactory;

import com.twins.designpattern.factory.abstractfactory.ICourseFactory;
import com.twins.designpattern.factory.abstractfactory.JavaCourseFactory;

/**
 * Created on 2019/3/7
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        factory.createNote();
        factory.createVideo();
    }

}
