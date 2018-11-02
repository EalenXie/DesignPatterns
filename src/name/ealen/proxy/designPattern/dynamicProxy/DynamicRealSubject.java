package name.ealen.proxy.designPattern.dynamicProxy;

/**
 * Created by EalenXie on 2018/11/2 12:56.
 */
public class DynamicRealSubject implements DynamicSubject {
    @Override
    public void operation() {
        System.out.println("真实对象 : 重要操作");
    }
}
