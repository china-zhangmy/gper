package com.twins.designpattern.factory.factorymethod;

import com.twins.designpattern.factory.ICourse;
import com.twins.designpattern.factory.JavaCourse;

/**
 * Created on 2019/3/19
 */
public class JavaCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new JavaCourse();
    }

}
