package name.ealen.strategy.designPattern;

/**
 * Created by EalenXie on 2018/9/28 10:01.
 */
public class StrategyContext {

    private Strategy strategy;


    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int algorithmExecute(int a, int b) {
        return this.strategy.algorithmInterface(a, b);
    }

}
