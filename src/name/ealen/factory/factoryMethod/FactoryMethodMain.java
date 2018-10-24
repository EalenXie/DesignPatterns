package name.ealen.factory.factoryMethod;

import name.ealen.factory.factoryMethod.designPattern.*;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/10/24 13:41.
 */
public class FactoryMethodMain {

    /**
     * 工厂方法
     */
    @Test
    public void designPattern() {

        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        apple.get();

        FruitFactory bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.getFruit();
        banana.get();

    }

}
