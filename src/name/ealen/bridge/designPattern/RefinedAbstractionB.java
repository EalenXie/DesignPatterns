package name.ealen.bridge.designPattern;

/**
 * Created by EalenXie on 2018/11/13 15:28.
 */
public class RefinedAbstractionB extends Abstraction {
    public void operation() {
        System.out.print("RefinedAbstractionB :\t");
        super.operation();
    }

    @Override
    public void ownOperation() {
        System.out.print(this);
    }
}
