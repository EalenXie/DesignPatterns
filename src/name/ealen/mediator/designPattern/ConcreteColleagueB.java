package name.ealen.mediator.designPattern;

/**
 * Created by EalenXie on 2018/11/21 10:39.
 */
public class ConcreteColleagueB extends Colleague {
    @Override
    public void operation() {
        System.out.print("this is ConcreteColleagueB's operation\n");
    }

    public void callColleagueA() {
        mediator.notifyColleagueA();
    }
}
