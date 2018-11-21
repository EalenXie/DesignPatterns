package name.ealen.flyweight;

import name.ealen.flyweight.designPattern.Flyweight;
import name.ealen.flyweight.designPattern.FlyweightFactory;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/11/1 11:49.
 */
public class FlyweightMain {


    @Test
    public void designPattern() {
        FlyweightFactory factory = new FlyweightFactory();

        //创建一个内部状态为A的对象，外部状态为First
        Flyweight fly = factory.findFlyweight("A");
        fly.operation("First");

        //创建一个内部状态为A的对象，外部状态为Second , 减少了创建
        fly = factory.findFlyweight("A");
        fly.operation("Second");

        //创建一个内部状态为C的对象，外部状态为Third
        fly = factory.findFlyweight("C");
        fly.operation("Third");

    }
}
