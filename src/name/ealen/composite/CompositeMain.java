package name.ealen.composite;

import name.ealen.composite.designPattern.Leaf;
import name.ealen.composite.designPattern.Component;
import org.junit.Test;

import java.util.List;

/**
 * Created by EalenXie on 2018/11/13 14:15.
 */
public class CompositeMain {

    @Test
    public void designPattern() {
        Component root = new Leaf("root");

        Component leaf = new Leaf("leaf");

        Component subLeaf = new Leaf("subLeaf");

        leaf.addChild(subLeaf);

        root.addChild(leaf);

        root.operation();

        leaf.operation();

        subLeaf.operation();


    }

    /**
     * 递归
     */
    private void displayTree(Component root) {
        root.operation();
        List<Component> children = root.getChild();
        for (Component component : children) {
            displayTree(component);
        }

    }
}
