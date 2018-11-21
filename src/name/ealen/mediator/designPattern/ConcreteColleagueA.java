package name.ealen.mediator.designPattern;

/**
 * Created by EalenXie on 2018/11/21 10:39.
 */
public class ConcreteColleagueA extends Colleague {
    @Override
    public void operation() {
        System.out.print("this is ConcreteColleagueA's operation\n");
    }

    public void callColleagueB() {
        mediator.notifyColleagueB();
    }


}
