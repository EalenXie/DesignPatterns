package name.ealen.decorator.designPattern;

/**
 * Created by EalenXie on 2018/10/29 17:44.
 */
public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
