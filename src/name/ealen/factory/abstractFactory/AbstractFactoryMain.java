package name.ealen.factory.abstractFactory;

import name.ealen.factory.abstractFactory.designPattern.Fruit;
import name.ealen.factory.abstractFactory.designPattern.FruitFactory;
import name.ealen.factory.abstractFactory.designPattern.NorthFruitFactory;
import name.ealen.factory.abstractFactory.designPattern.SouthFruitFactory;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/10/24 14:29.
 */
public class AbstractFactoryMain {

    /**
     * 抽象工厂
     */
    @Test
    public void designPattern() {
        FruitFactory northFruitFactory = new NorthFruitFactory();
        FruitFactory southFruitFactory = new SouthFruitFactory();

        Fruit appleNorth = northFruitFactory.getApple();
        Fruit bananaNorth = northFruitFactory.getBanana();
        Fruit appleSouth = southFruitFactory.getApple();
        Fruit bananaSouth = southFruitFactory.getBanana();
        appleNorth.get();
        bananaNorth.get();
        appleSouth.get();
        bananaSouth.get();

    }
}
