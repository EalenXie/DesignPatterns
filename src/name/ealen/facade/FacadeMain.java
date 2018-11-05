package name.ealen.facade;

import name.ealen.facade.designPattern.SystemFacade;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/11/5 9:54.
 */
public class FacadeMain {

    /**
     * 标准实现
     */
    @Test
    public void designPattern() {
        SystemFacade facade= new SystemFacade();
        facade.operation();
    }
}
