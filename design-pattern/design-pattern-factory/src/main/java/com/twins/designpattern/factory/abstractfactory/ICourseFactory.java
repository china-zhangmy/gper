package com.twins.designpattern.factory.abstractfactory;

import com.twins.designpattern.factory.ICourse;
import com.twins.designpattern.factory.INote;
import com.twins.designpattern.factory.IVideo;

/**
 * Created on 2019/3/7
 *
 * 要求所有的子工厂都实现这个工厂 —— 一个品牌的抽象
 *
 * 抽象工厂不符合“开闭原则”，扩展性非常强。
 */
public interface ICourseFactory {

    ICourse createCourse();

    INote createNote();

    IVideo createVideo();

}
