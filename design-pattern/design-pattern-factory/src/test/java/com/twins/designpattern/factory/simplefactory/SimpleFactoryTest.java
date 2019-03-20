package com.twins.designpattern.factory.simplefactory;

import com.twins.designpattern.factory.ICourse;
import com.twins.designpattern.factory.JavaCourse;

/**
 * Created on 2019/3/7
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();

        // 缺点： 入参容易传错
        ICourse course = factory.create("java");
        course.record();

        // 缺点： 入参仍然容易传错
        ICourse course2 = factory.create2("com.twins.designpattern.factory.JavaCourse");
        course2.record();

        // 优点： 入参不容易传错；缺点： 需要引入被创建对象的包
        ICourse course3 = factory.create3(JavaCourse.class);
        course3.record();

    }

}
