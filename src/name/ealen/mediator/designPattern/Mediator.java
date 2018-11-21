package name.ealen.mediator.designPattern;

/**
 * Created by EalenXie on 2018/11/21 10:38.
 */
public abstract class Mediator {

    protected Colleague colleagueA;
    protected Colleague colleagueB;

    public Mediator(Colleague colleagueA, Colleague colleagueB) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }

    public abstract void notifyColleagueA();

    public abstract void notifyColleagueB();
}
