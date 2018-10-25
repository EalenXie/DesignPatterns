package name.ealen.singleton.designPattern;

/**
 * Created by EalenXie on 2018/10/25 10:02.
 * 4 . 同步方法懒汉式 写法
 * 和简单懒汉式写法基本一样,只是在获取实例的方法上面加了同步关键字解决了多线程的问题。
 * 优点 : 基本实现了Lazy Load,也不会有线程问题。
 * 缺点 : 效率实在太低，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 * 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。
 * 方法进行同步效率太低。
 */
public class LazySynchronizedSingleton {
    private static LazySynchronizedSingleton INSTANCE;

    private LazySynchronizedSingleton() {
    }

    public static synchronized LazySynchronizedSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySynchronizedSingleton();
        }
        return INSTANCE;
    }
}
