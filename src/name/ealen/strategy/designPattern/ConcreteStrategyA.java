package name.ealen.strategy.designPattern;

/**
 * Created by EalenXie on 2018/9/28 9:59.
 */
public class ConcreteStrategyA implements Strategy {


    /**
     * 算法A 做值相加
     */
    @Override
    public int algorithmInterface(int a, int b) {
        return a + b;
    }
}
