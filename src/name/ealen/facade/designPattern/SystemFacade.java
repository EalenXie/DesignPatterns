package name.ealen.facade.designPattern;

/**
 * Created by EalenXie on 2018/11/5 9:52.
 */
public class SystemFacade {

    private SystemA a;
    private SystemB b;

    public SystemFacade() {
        a = new SystemA();
        b = new SystemB();
    }

    public void operation() {
        a.handleA();
        b.handleB();
        System.out.println("调用完成");
    }
}
