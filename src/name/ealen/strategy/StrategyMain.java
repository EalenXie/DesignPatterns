package name.ealen.strategy;

import name.ealen.strategy.designPattern.ConcreteStrategyA;
import name.ealen.strategy.designPattern.ConcreteStrategyB;
import name.ealen.strategy.designPattern.StrategyContext;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/9/28 9:52.
 */
public class StrategyMain {

    private int a = 2;
    private int b = 5;
    private int c;

    /**
     * 使用策略模式,切换算法实现
     */
    @Test
    public void designPattern() {

        //策略Context 指定使用 算法A
        StrategyContext strategyContext = new StrategyContext(new ConcreteStrategyA());
        c = strategyContext.algorithmExecute(a, b);
        System.out.println("算法A 计算两数相加 : " + c);

        //策略Context 平滑切换到 算法B
        strategyContext = new StrategyContext(new ConcreteStrategyB());
        c = strategyContext.algorithmExecute(a, b);
        System.out.println("算法B 计算两数相乘 : " + c);

        //乍一看和不使用设计模式差不多 , 但是关注点却不一样了
        //只需要关注指定哪个算法即可,实现都由StrategyContext去调用
    }


    /**
     * 不使用设计模式 切换算法实现
     */
    @Test
    public void noDesignPattern() {

        //想使用算法A new出算法A
        ConcreteStrategyA strategyA = new ConcreteStrategyA();
        //然后 算法A 调用 A的算法方法实现
        c = strategyA.algorithmInterface(a, b);
        System.out.println("算法A 计算两数相加 : " + c);

        //想使用算法B  new出算法B
        ConcreteStrategyB strategyB = new ConcreteStrategyB();
        //然后 算法B 调用 B的算法方法实现
        c = strategyB.algorithmInterface(a, b);
        System.out.println("算法B 计算两数相乘 : " + c);
    }
}
