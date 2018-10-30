package name.ealen.observer.standard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EalenXie on 2018/10/30 9:34.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();  //被观察者维护的 一个观察者对象的队列列表

    private int state = 0;  //状态值，假设初始值为0

    public int getState() {
        return state;
    }

    /**
     * 这里设置 状态值发生变化就通知所有的观察者
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * 新增观察者
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }


    /**
     * 删除观察者
     */
    public void delete(Observer observer) {
        if (observer != null) if (!observers.isEmpty()) observers.remove(observer);
    }

    /**
     * 遍历 通知所有的观察者(通过调用观察者的callback来通知)
     * 通知的时机可以自定义
     */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.callback();
        }
    }

}
