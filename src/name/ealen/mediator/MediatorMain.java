package name.ealen.mediator;

import name.ealen.mediator.designPattern.*;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/11/21 10:44.
 */
public class MediatorMain {


    @Test
    public void designPattern() {

        Colleague a = new ConcreteColleagueA();                 //同事A
        Colleague b = new ConcreteColleagueB();                 //同事B

        Mediator mediator = new ConcreteMediator(a, b);         //中介者

        a.setMediator(mediator);                                //A指定中介者
        b.setMediator(mediator);                                //B指定中介者

        ((ConcreteColleagueA) a).callColleagueB();              //A经由中介调用B
        ((ConcreteColleagueB) b).callColleagueA();              //B经由中介调用A

    }
}
