package name.ealen.simpleFactory;

import name.ealen.simpleFactory.designPattern.Fruit;
import name.ealen.simpleFactory.designPattern.FruitFactory;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/10/22 9:50.
 */
public class SimpleFactoryMain {


    @Test
    public void designPattern() {

        Fruit apple = FruitFactory.getApple();
        Fruit banana = FruitFactory.getBanana();
        apple.get();
        banana.get();

        Fruit apple2= FruitFactory.getFruitByClassName("Apple");
        Fruit banana2= FruitFactory.getFruitByClassName("Banana");
        apple2.get();
        banana2.get();


    }

}
