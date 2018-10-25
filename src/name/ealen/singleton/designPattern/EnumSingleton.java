package name.ealen.singleton.designPattern;

/**
 * Created by EalenXie on 2018/10/25 10:42.
 * 7 . 枚举单例 写法: 个人最爱使用。
 * 这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。
 * 不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
 * <p>
 * 优点 : 写法简洁，自动支持序列化机制，绝对单例。
 * 缺点 : 无法从另一个基类继承,因为它已经继承自java.lang.Enum,也不能通过reflection attack来调用私有构造方法。
 */
public enum EnumSingleton {
    INSTANCE;

    public static void yourMethod() {
    }

}
