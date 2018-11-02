package name.ealen.proxy.designPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by EalenXie on 2018/11/2 12:57.
 * 代理的调用处理类
 */
public class ProxyHandler implements InvocationHandler {

    private Object realSubject;     //指定被代理的真实对象

    public ProxyHandler(Object realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {

        before();                                           //自定义逻辑

        Object result = method.invoke(realSubject, args);   //调用真实对象的操作

        after();                                            //自定义逻辑

        return result;

    }

    private void after() {
        System.out.println("代理人 : 真实对象的操作完成了");
    }

    private void before() {
        System.out.println("代理人 : 开始完成真实对象的操作");
    }
}
