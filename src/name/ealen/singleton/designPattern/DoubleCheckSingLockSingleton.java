package name.ealen.singleton.designPattern;

/**
 * Created by EalenXie on 2018/10/25 10:15.
 * 5 . 双重校验锁(DCL, double-checked locking) 写法 : 其实就是懒汉式的高级升级版
 * volatile告诉运行时环境该变量是共享的,JVM每次读该变量都从内存中直接读取,跳过CPU cache
 * 因此在访问volatile变量时不会执行加锁操作，不会使执行线程阻塞
 * <p>
 * 优点 : 线程安全；延迟加载；效率较高。
 * 缺点 : 写法相对较为复杂
 */
public class DoubleCheckSingLockSingleton {

    private volatile static DoubleCheckSingLockSingleton INSTANCE;

    private DoubleCheckSingLockSingleton() {
    }

    public static DoubleCheckSingLockSingleton getSingleton() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckSingLockSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingLockSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
