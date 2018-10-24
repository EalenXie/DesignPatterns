package name.ealen.factory.abstractFactory.designPattern;


/**
 * Created by EalenXie on 2018/10/24 14:26.
 */
public  class SouthFruitFactory implements FruitFactory {


    @Override
    public Fruit getApple() {
        return new AppleSouth();
    }

    @Override
    public Fruit getBanana() {
        return new BananaSouth();
    }
}
