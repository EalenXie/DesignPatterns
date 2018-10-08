package name.ealen.memento.designPattern;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by EalenXie on 2018/9/27 17:39.
 */
public class CareTaker {

    private Map<String, Memento> mementos = new HashMap<>(); //一个或者多个备份录


    //保存默认备份
    public void saveDefaultMemento(Memento memento) {
        mementos.put("default", memento);
    }

    //获取默认备份
    public Memento getMementoByDefault() {
        return mementos.get("default");
    }

    //根据备份名 保存备份
    public void saveMementoByName(String mementoName, Memento memento) {
        mementos.put(mementoName, memento);
    }

    //根据备份名 获取备份
    public Memento getMementoByName(String mementoName) {
        return mementos.get(mementoName);
    }


    //删除默认备份
    public void deleteDefaultMemento() {
        mementos.remove("default");
    }

    //根据备份名 删除备份
    public void deleteMementoByName(String mementoName) {
        mementos.remove(mementoName);
    }
}
