/**
 * 装饰器模式(包装者模式) : 通过对客户端透明的方式来扩展对象的功能。是继承关系的一种替换方案
 * 声明 : 允许向一个现有的对象添加新的功能，同时又不改变其结构。
 * 抽象组件(Component) : 一个抽象接口，是 被装饰者(即具体的抽象组件，ConcreteComponent)和 装饰者(即抽象的装饰器，Decorator)的父接口
 * 具体的抽象组件(ConcreteComponent) : 为抽象组件的基本实现类。
 * 抽象的装饰器(Decorator) : 包含一个抽象组件的引用。
 * 具体的装饰器(ConcreteDecorator) : 抽象的装饰者的具体实现, 负责实现装饰。
 */
package name.ealen.decorator;