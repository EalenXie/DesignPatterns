package name.ealen.proxy.designPattern.staticProxy;

/**
 * Created by EalenXie on 2018/11/2 10:18.
 */
public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * 目的 : 代理真实对象完成方法调用，代理可以进行相对不重要的行为扩展
     */
    @Override
    public void operation() {
        before();
        subject.operation();
        after();
    }

    private void after() {
        System.out.println("代理人 : 真实对象的操作完成了");
    }

    private void before() {
        System.out.println("代理人 : 开始完成真实对象的操作");
    }
}
