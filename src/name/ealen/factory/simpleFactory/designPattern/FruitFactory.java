package name.ealen.factory.simpleFactory.designPattern;

/**
 * Created by EalenXie on 2018/10/22 10:02.
 * 简单工厂
 */
public class FruitFactory {

    public static Fruit getApple() {
        return new Apple();
    }

    public static Fruit getBanana() {
        return new Banana();
    }


    /**
     * 结合反射很强
     */
    public static Fruit getFruitByClassName(String className) {
        try {
            Class fruit = Class.forName(className);
            return (Fruit) fruit.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            return () -> System.out.println("不知名的水果");
        }
    }

}
