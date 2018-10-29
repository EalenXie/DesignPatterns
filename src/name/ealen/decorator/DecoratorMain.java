package name.ealen.decorator;

import name.ealen.decorator.designPattern.*;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/10/29 17:31.
 */
public class DecoratorMain {


    /**
     * 标准实现
     */
    @Test
    public void designPattern() {

        Component component = new ConcreteComponent();

        Decorator a = new ConcreteDecorator(component, "A");   //一次装饰

        Decorator b = new ConcreteDecorator(a, "B");           //二次装饰(在一次装饰的基础上)

        Decorator c = new ConcreteDecorator(b, "C");           //三次装饰(在二次装饰的基础上)

        c.operation();

    }
}
