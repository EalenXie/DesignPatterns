/**
 * Created by EalenXie on 2018/11/21 10:34.
 * 中介者模式 : Mediator
 * Mediator : 抽象中介者角色，定义了同事对象到中介者对象的接口。
 * ConcreteMediator :具体中介者角色，它从具体的同事对象接收消息，向具体同事发出命令。
 * Colleague : 抽象同事角色，定义了中介者对象接口，它只知道中介者而不知道其他同事对象。
 * ConcreteColleague :具体同事角色，每个具体同事类都知道自己在小范围内的行为，而不知道它在大范围内的目的。
 */
package name.ealen.mediator;