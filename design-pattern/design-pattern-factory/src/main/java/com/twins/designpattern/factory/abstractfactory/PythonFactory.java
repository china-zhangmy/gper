package com.twins.designpattern.factory.abstractfactory;

import com.twins.designpattern.factory.ICourse;

/**
 * Created on 2019/3/20
 */
public class PythonFactory implements ICourseFactory {

    public ICourse createCourse() {
        return null;
    }

    public INote createNote() {
        return null;
    }

    public IVideo createVideo() {
        return null;
    }
}
