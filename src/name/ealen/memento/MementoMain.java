package name.ealen.memento;

import name.ealen.memento.designPattern.CareTaker;
import name.ealen.memento.designPattern.Originator;
import name.ealen.memento.myDefine.MyPerson;
import name.ealen.memento.noDesignPattern.Person;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/9/27 15:19.
 */
public class MementoMain {


    /**
     * 备忘录模式,标准实现
     */
    @Test
    public void designPattern() {
        Originator originator = new Originator("ealenxie", "男", 22);
        CareTaker careTaker = new CareTaker();

        //新建一个默认备份,将Originator的初始属性赋值进去
        careTaker.saveDefaultMemento(originator.createMemento());

        //初始化的Originator
        System.out.println("初始化的对象 : " + originator);

        //修改后的Originator
        originator.setName("ZHANG SAN");
        originator.setSex("女");
        originator.setAge(23);
        System.out.println("第一次修改后的对象 : " + originator);

        //新建一个修改后的备份
        careTaker.saveMementoByName("第一次修改备份", originator.createMemento());

        //根据默认备份还原rollback后的Originator
        originator.rollbackByMemento(careTaker.getMementoByDefault());
        System.out.println("还原后的对象 : " + originator);

        //根据备份名还原rollback后的Originator
        originator.rollbackByMemento(careTaker.getMementoByName("第一次修改备份"));
        System.out.println("第一次修改备份 : " + originator);

        //再创建一个默认备份
        careTaker.saveDefaultMemento(originator.createMemento());
        originator.rollbackByMemento(careTaker.getMementoByDefault());
        System.out.println("最后创建的默认备份 : " + originator);
    }


    /**
     * 自定义实现备忘录模式,参考标准实现
     */
    @Test
    public void myDefine() {
        MyPerson myPerson = new MyPerson("ealenxie", "男", 22);

        //新建一个默认备份,将MyPerson的初始属性赋值进去
        myPerson.createDefaultBackup();

        //初始化的MyPerson
        System.out.println("初始化的对象 : " + myPerson);

        //修改后的MyPerson
        myPerson.setAge(23);
        myPerson.setSex("女");
        myPerson.setName("ZHANG SAN");
        System.out.println("第一次修改后的对象 : " + myPerson);

        //新建一个修改后的备份
        myPerson.createBackupByName("第一次修改备份");

        //根据默认备份还原rollback后的MyPerson
        myPerson.rollbackByDefault();
        System.out.println("还原后的对象 : " + myPerson);

        //根据备份名还原rollback后的MyPerson
        myPerson.rollbackByBackupName("第一次修改备份");
        System.out.println("第一次修改备份 : " + myPerson);

        //再创建一个默认备份
        myPerson.createDefaultBackup();
        System.out.println("最后创建的默认备份 : " + myPerson);
    }


    /**
     * 不使用设计模式 实现备忘录模式,普通保存实例的内部状态
     */
    @Test
    public void noDesignPattern() {
        Person person = new Person("ealenxie", "男", 23);

        //新建一个Person的Backup备份,将对象的初始属性赋值进去
        Person backup = new Person();
        backup.setName(person.getName());
        backup.setSex(person.getSex());
        backup.setAge(person.getAge());

        //初始的person
        System.out.println("初始化的对象 : " + person);

        //修改后person
        person.setAge(22);
        person.setName("ZHANG SAN");
        person.setSex("女");
        System.out.println("修改后的对象 : " + person);

        //回滚(回复以前状态) 从backup中获取之前的状态,重新赋值
        person.setAge(backup.getAge());
        person.setName(backup.getName());
        person.setSex(backup.getSex());
        System.out.println("还原后的对象 : " + person);
    }


}
