package name.ealen.factory.abstractFactory.designPattern;

/**
 * Created by EalenXie on 2018/10/24 14:28.
 */
public class NorthFruitFactory implements FruitFactory{
    @Override
    public Fruit getApple() {
        return new AppleNorth();
    }

    @Override
    public Fruit getBanana() {
        return new BananaNorth();
    }
}
