package name.ealen.observer.designPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by EalenXie on 2018/10/30 13:37.
 * 观察者
 */
public class PersonObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Person) {
            System.out.println("被观察者：" + ((Person) o).getName() + " 改变了，通知参数 : " + arg);
        }
    }
}
