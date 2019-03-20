/**
 * Created on 2019/3/7
 *
 * 工厂方法模式（Factory Method Pattern）是指定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，
 * 工厂方法让类的实例化推迟到子类中进行。
 *
 * Define an interface for creating an object, but let subclasses decide which class to instantiate.
 * The factory method lets a class defer instantiation it uses to subclasses.
 *
 * 属于创建型设计模式。
 *
 * 适用场景：
 *      创建对象需要大量重复的代码。
 *      客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。
 *      一个类通过其子类来指定创建哪个对象。
 *
 * 优点：
 *      用户只需关心所需产品对应的工厂，无须关心创建细节——无须传入创建参数。
 *      加入新产品符合“开闭原则”，提高了系统的可扩展性。
 *
 * 缺点：
 *      类的个数容易过多，增加了代码结构的复杂度。
 *      增加了系统的抽象性和理解难度。
 *
 * 经典场景：
 *      // LoggerFactory
 *      org.slf4j.ILoggerFactory.getLogger(...);
 *          org.slf4j.impl.Log4jLoggerFactory.getLogger(...)
 *          org.slf4j.helpers.NOPLoggerFactory.getLogger(...)
 *          org.slf4j.helpers.SubstituteLoggerFactory.getLogger(...)
 *
 *
 */
package com.twins.designpattern.factory.factorymethod;