package name.ealen.factory.factoryMethod.designPattern;

/**
 * Created by EalenXie on 2018/10/24 11:48.
 * 具体工厂
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
