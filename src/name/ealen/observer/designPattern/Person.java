package name.ealen.observer.designPattern;

import java.util.Observable;

/**
 * Created by EalenXie on 2018/10/30 13:32.
 * 被观察者
 */
public class Person extends Observable {

    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.setChanged();
        notifyObservers();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        this.setChanged();
        notifyObservers("带参数的通知");
    }


}
