package name.ealen.decorator.designPattern;

/**
 * Created by EalenXie on 2018/10/29 17:48.
 */
public class ConcreteDecorator extends Decorator {

    private String name;

    public ConcreteDecorator(Component component, String name) {
        super(component);
        this.name = name;
    }

    @Override
    public void operation() {

        //原有component的操作
        super.component.operation();

        //扩展的操作
        System.out.println("扩展的 " + name + " 操作");
    }
}
