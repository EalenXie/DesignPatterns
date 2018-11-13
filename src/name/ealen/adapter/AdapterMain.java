package name.ealen.adapter;

import name.ealen.adapter.designPattern.Adapee;
import name.ealen.adapter.designPattern.Adapter;
import name.ealen.adapter.designPattern.Target;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/11/13 17:39.
 */
public class AdapterMain {

    @Test
    public void designPattern() {
        Adapee adapee = new Adapee();                       //需要适配的源接口对象
        Target target = new Adapter(adapee);                //客户端需要的目标接口对象，指定适配器进行实现适配
        target.requiredMethod();                            //客户端调用目标接口。
    }
}
