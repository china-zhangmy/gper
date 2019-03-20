package com.twins.designpattern.factory.abstractfactory;

import com.twins.designpattern.factory.*;

/**
 * Created on 2019/3/20
 */
public class JavaCourseFactory implements ICourseFactory {

    public ICourse createCourse() {
        return new JavaCourse();
    }

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
