/**
 * 观察者模式(发布订阅模式) : Observer
 * 声明 : 行为型模式，当一个对象的状态发生变化时，能够自动通知其他关联对象
 * 定义 : 提供给关联对象一种同步信息的手段，使某个对象与依赖它的其他对象之间保持同步
 * 被观察者(Subject) : 当被观察者的状态发生变化时，需要通知队列中所有观察者对象。被观察者需要维护(添加，删除，通知)一个观察者对象的队列列表(有一个ArrayList存放观察者们。)
 * 观察者(Observer) : 接口或抽象类，当被观察者的状态发生变化时，observer对象将通过一个callback函数得到通知
 * 具体的观察者(ConcreteObserver) : 观察者的具体实现。
 * 注意 : 1、JAVA 中已经有了对观察者模式的支持类。 2、避免循环引用。 3、如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式。
 * Java已有实现 :
 * 1 . 被观察者请继承Observable，自己选择通知时机，注册观察者，触发请调用setChanged()表明自己发生了改变; notifyObservers()通知观察者
 * 2 . 观察者请实现Observer接口，update()方法是得到通知后的处理逻辑。
 */
package name.ealen.observer;