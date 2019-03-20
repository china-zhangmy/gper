package com.twins.designpattern.factory.abstractfactory;

import com.twins.designpattern.factory.*;

/**
 * Created on 2019/3/20
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse createCourse() {
        return new PythonCourse();
    }

    public INote createNote() {
        return new PythonNote();
    }

    public IVideo createVideo() {
        return new PythonVideo();
    }
}
