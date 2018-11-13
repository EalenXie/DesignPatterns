package name.ealen.composite.designPattern;

import java.util.List;

/**
 * Created by EalenXie on 2018/11/5 14:44.
 */
public interface Component {


    public void operation();

    public void addChild(Component component);

    public void removeChild(Component component);

    public List<Component> getChild();
}
