package name.ealen.observer;

import name.ealen.observer.designPattern.Person;
import name.ealen.observer.designPattern.PersonObserver;
import name.ealen.observer.standard.ConcreteObserver;
import name.ealen.observer.standard.Observer;
import name.ealen.observer.standard.Subject;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/10/30 10:08.
 */
public class ObserverMain {


    /**
     * 标准实现，java.util中已经有了对观察者模式的支持类(Observer ，Observable)
     */
    @Test
    public void designPattern() {

        Person person= new Person();                        //一个被观察者

        PersonObserver observer= new PersonObserver();      //观察者 1

        person.addObserver(observer);                       //被观察者 注册 观察者 1

        person.setName("Zhang San");                        //被观察者 状态改变

        person.setSex("男");                                //被观察者 状态改变

    }


    /**
     * 标准手动实现
     */
    @Test
    public void standard() {

        Subject subject = new Subject();                                  //一个被观察者

        Observer observer1 = new ConcreteObserver("zhangsan");     //观察者 1

        Observer observer2 = new ConcreteObserver("lisi");         //观察者 2

        subject.attach(observer1);                                        //被观察者 注册 观察者1

        subject.attach(observer2);                                        //被观察者 注册 观察者2

        System.out.println("Subject的 状态值 : " + subject.getState());    //被观察者的初始状态值

        subject.setState(20);                                            //被观察者的状态值发生变化，通知观察者


    }
}


