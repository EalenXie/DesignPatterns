package name.ealen.factory.factoryMethod.designPattern;


/**
 * Created by EalenXie on 2018/10/22 9:58.
 */
public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
