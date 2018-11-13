package name.ealen.bridge.designPattern;

/**
 * Created by EalenXie on 2018/11/13 14:59.
 */
public class RefinedAbstractionA extends Abstraction {
    public void operation() {
        System.out.print("RefinedAbstractionA :\t");
        super.operation();
    }

    @Override
    public void ownOperation() {
        System.out.print(this);
    }
}
