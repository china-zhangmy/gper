/**
 * Created on 2019/3/7
 *
 * 简单工厂模式（Simple Factory Pattern）是指由一个工厂对象决定创建出哪一种产品类的实例。
 *
 * 属于创建型模式，但它不属于 GOF 23种设计模式。
 *
 * 场景：
 *      适用于产品的创建逻辑比较稳定，产品种类较少的情况；
 *      客户端只需要传入工厂类的参数，对于如何创建对象的逻辑不需要关心。
 * 优点：
 *      只需要传入一个“正确”的参数，就可以获取你所需要的对象，无须知道其创建的细节。
 *
 * 缺点：
 *      工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断逻辑，违背“开闭原则”。
 *      不易于扩展过于复杂的产品结构；否则，工厂类会包含大量的if/else分支。
 *
 * 经典场景：
 *      // Calendar
 *      Calendar.getInstance();
 *      Calendar.getInstance(TimeZone.getDefault());
 *      Calendar.getInstance(Locale.CHINA);
 *      Calendar.getInstance(TimeZone.getDefault(), Locale.CHINA);
 *
 *      // LoggerFactory
 *      LoggerFactory.getLogger("JavaCourse");
 *      LoggerFactory.getLogger(JavaCourse.class);
 *
 */
package com.twins.designpattern.factory.simplefactory;