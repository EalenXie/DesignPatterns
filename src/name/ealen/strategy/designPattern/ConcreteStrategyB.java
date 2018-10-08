package name.ealen.strategy.designPattern;

/**
 * Created by EalenXie on 2018/9/28 9:59.
 */
public class ConcreteStrategyB implements Strategy {


    /**
     * 算法B 做值相乘
     */
    @Override
    public int algorithmInterface(int a, int b) {
        return a * b;
    }
}
