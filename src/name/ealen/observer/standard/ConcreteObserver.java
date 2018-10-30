package name.ealen.observer.standard;

/**
 * Created by EalenXie on 2018/10/30 9:45.
 */
public class ConcreteObserver extends Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println("Subject的状态值更新了 , Subject通知观察者 " + name );
    }
}
