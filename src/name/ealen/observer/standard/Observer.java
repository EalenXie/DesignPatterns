package name.ealen.observer.standard;

/**
 * Created by EalenXie on 2018/10/30 9:34.
 * 观察者
 */
public abstract class Observer {

    /**
     * 被观察者 通过  观察者的callback方法 来通知 观察者
     */
    public abstract void callback();
}
