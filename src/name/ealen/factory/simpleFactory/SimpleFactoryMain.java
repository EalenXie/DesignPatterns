package name.ealen.factory.simpleFactory;

import name.ealen.factory.simpleFactory.designPattern.Fruit;
import name.ealen.factory.simpleFactory.designPattern.FruitFactory;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/10/22 9:50.
 */
public class SimpleFactoryMain {


    /**
     * 简单(静态)工厂
     */
    @Test
    public void designPattern() {
        Fruit apple = FruitFactory.getApple();
        Fruit banana = FruitFactory.getBanana();
        apple.get();
        banana.get();
    }

    /**
     * 结合反射很强
     */
    @Test
    public void getFruitByClassName() {
        Fruit apple = FruitFactory.getFruitByClassName("name.ealen.factory.simpleFactory.designPattern.Apple");
        Fruit banana = FruitFactory.getFruitByClassName("name.ealen.factory.simpleFactory.designPattern.Banana");
        apple.get();
        banana.get();
    }


}
