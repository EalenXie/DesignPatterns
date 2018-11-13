package name.ealen.composite.designPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EalenXie on 2018/11/13 13:56.
 */
public class Leaf implements Component {


    private String name;

    private List<Component> children = new ArrayList<>();

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(this);
    }

    @Override
    public void addChild(Component component) {
        if (component != null) children.add(component);
    }

    @Override
    public void removeChild(Component component) {
        children.remove(component);
    }


    @Override
    public List<Component> getChild() {
        return children;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
