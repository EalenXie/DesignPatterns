package name.ealen.proxy;

import name.ealen.proxy.designPattern.dynamicProxy.DynamicRealSubject;
import name.ealen.proxy.designPattern.dynamicProxy.DynamicSubject;
import name.ealen.proxy.designPattern.dynamicProxy.ProxyHandler;
import name.ealen.proxy.designPattern.staticProxy.ProxySubject;
import name.ealen.proxy.designPattern.staticProxy.RealSubject;
import name.ealen.proxy.designPattern.staticProxy.Subject;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by EalenXie on 2018/11/2 11:10.
 */
public class ProxyMain {

    /**
     * 静态代理
     */
    @Test
    public void staticProxy() {

        Subject realSubject = new RealSubject();              //一个真实对象

        Subject proxy = new ProxySubject(realSubject);        //一个代理人，指定要代理的真实对象，类型只能是Subject及其子类

        proxy.operation();                                    //整个操作由代理人帮真实对象完成，代理人还做了操作说明
    }

    /**
     * 动态代理，基于反射类实现
     */
    @Test
    public void dynamicProxy() {

        //一个真实对象
        DynamicSubject subject = new DynamicRealSubject();

        //动态代理处理逻辑 ,基于反射类InvocationHandler实现，指定要代理的真实对象，可以是任何类型
        InvocationHandler proxyHandler = new ProxyHandler(subject);

        //一个代理人,实例化基于反射类Proxy实现。
        DynamicSubject proxy = (DynamicSubject) Proxy.newProxyInstance(DynamicSubject.class.getClassLoader(), subject.getClass().getInterfaces(), proxyHandler);

        //整个操作由代理人帮真实对象完成，代理人还做了操作说明
        proxy.operation();

    }
}
