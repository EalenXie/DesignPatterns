package name.ealen.prototype.designPattern;

import java.io.*;
import java.util.List;

/**
 * Created by EalenXie on 2018/10/25 11:42.
 */
public class Person implements Cloneable, Serializable {

    private String name;
    private Integer age;

    private List<String> friends;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    /**
     * 浅克隆 : 只负责克隆按值传递的数据，而不克隆它所引用的对象
     * 实现方式 : 实现Cloneable接口，直接调用Object的clone方法
     */
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            //没有实现Cloneable接口的类会抛出该异常
            e.printStackTrace();
        }
        return clone;
    }

    /**
     * 深克隆  : 除了浅克隆要克隆的值外，还负责克隆引用类型的数据。
     * 实现方式 : 一般通过实现 Serializable 读取二进制流，得到一个所有都是全新的对象。
     */
    public Person deepClone() throws Exception {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bo);
        oos.writeObject(this);
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (Person) oi.readObject();
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                '}';
    }
}
