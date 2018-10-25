package name.ealen.singleton.designPattern;

/**
 * Created by EalenXie on 2018/10/25 9:59.
 * 2 . 静态代码块饿汉式 写法
 * 优缺点和简单饿汉式一样
 */
public class EagerStaticSingleton {

    private static EagerStaticSingleton INSTANCE;

    static {
        INSTANCE = new EagerStaticSingleton();
    }

    private EagerStaticSingleton() {
    }

    public static EagerStaticSingleton getInstance() {
        return INSTANCE;
    }
}
