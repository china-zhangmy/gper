/**
 * Created on 2019/3/7
 *
 * 抽象工厂模式（Abstract Factory Pattern）是指提供一个创建一系列相关或相互依赖对象的接口，无须指定他们具体的类。
 *
 * Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 *
 * 属于创建型设计模式。
 *
 *  适用场景：
 *      客户端（应用层）不依赖于产品实例如何被创建、实现等细节。
 *      强调一系列相关的产品对象（属于同一产品族）一起使用，创建对象需要大量重复的代码。
 *      提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现。
 *
 *  优点：
 *      具体产品在应用层代码隔离，无须关心创建细节。
 *      将一个系列的产品族统一到一起创建。
 *
 *  缺点：
 *      规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口——违反“开闭原则”。
 *      增加了系统的抽象性和理解难度。
 */
package com.twins.designpattern.factory.abstractfactory;