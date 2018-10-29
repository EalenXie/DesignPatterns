package name.ealen.decorator.designPattern;

/**
 * Created by EalenXie on 2018/10/29 17:43.
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("基本操作");
    }
}
