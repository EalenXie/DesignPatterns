package name.ealen.adapter.designPattern;

/**
 * Created by EalenXie on 2018/11/13 17:32.
 */
public class Adapter implements Target {

    private Adapee adapee;


    public Adapter(Adapee adapee) { //指定适配源
        this.adapee = adapee;
    }

    @Override
    public void requiredMethod() {
        System.out.println("做了一些列参数转换操作进行适配");
        adapee.oldMethod();
    }
}
