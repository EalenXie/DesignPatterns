package name.ealen.proxy.designPattern.staticProxy;

/**
 * Created by EalenXie on 2018/11/2 10:17.
 */
public class RealSubject implements Subject {

    @Override
    public void operation() {
        System.out.println("真实对象 : 重要操作");
    }

}
