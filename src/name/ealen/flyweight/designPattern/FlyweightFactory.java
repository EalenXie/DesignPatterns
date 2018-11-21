package name.ealen.flyweight.designPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by EalenXie on 2018/11/1 11:34.
 */
public class FlyweightFactory {

    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    public Flyweight findFlyweight(String state) {
        //先从缓存中查找对象
        Flyweight fly = flyweightMap.get(state);
        if (fly == null) {
            //如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyweight(state);
            //把这个新的Flyweight对象添加到缓存中
            flyweightMap.put(state, fly);
        }
        return fly;
    }

    public int getSize() {
        return flyweightMap.size();
    }


}
