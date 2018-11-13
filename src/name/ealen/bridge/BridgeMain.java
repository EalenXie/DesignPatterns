package name.ealen.bridge;

import name.ealen.bridge.designPattern.*;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/11/13 15:12.
 */
public class BridgeMain {


    @Test
    public void designPattern() {
        Abstraction abstractionA = new RefinedAbstractionA();
        abstractionA.setImplementor(new ConcreteImplementorA());    //A实现
        abstractionA.operation();
        abstractionA.setImplementor(new ConcreteImplementorB());    //切换B实现
        abstractionA.operation();

        System.out.println("-----------寂寞的分割线--------------");

        Abstraction abstractionB = new RefinedAbstractionB();
        abstractionB.setImplementor(new ConcreteImplementorA());    //A实现
        abstractionB.operation();
        abstractionB.setImplementor(new ConcreteImplementorB());    //切换B实现
        abstractionB.operation();

    }
}
