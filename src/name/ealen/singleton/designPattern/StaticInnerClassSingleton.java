package name.ealen.singleton.designPattern;

/**
 * Created by EalenXie on 2018/10/25 10:32.
 * 6 . 静态内部类单例 写法
 * 实现机制和饿汉式类似,两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 * 不同的地方在饿汉式方式是只要StaticInnerClassSingleton类被装载就会实例化，没有Lazy-Loading的作用。
 * 而静态内部类方式是在需要实例化时，通过调用getInstance方法，才会装载StaticInnerClassSingleton类。
 * 类的静态属性只会在第一次加载类的时候初始化，JVM帮助我们保证了线程的安全性。
 * <p>
 * 优点：避免了线程不安全，延迟加载，效率高。
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
    }

    private static class StaticInnerClassSingletonInstance {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInnerClassSingletonInstance.INSTANCE;
    }
}
