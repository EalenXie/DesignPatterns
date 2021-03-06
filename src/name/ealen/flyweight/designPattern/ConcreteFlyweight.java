package name.ealen.flyweight.designPattern;

/**
 * Created by EalenXie on 2018/11/1 11:30.
 */
public class ConcreteFlyweight implements Flyweight {


    /**
     * 内部状态
     */
    private String intrinsicState;

    public ConcreteFlyweight(String state) {
        this.intrinsicState = state;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String state) {
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state+"\n");
    }
}
