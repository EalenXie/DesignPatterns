package name.ealen.memento.designPattern;

/**
 * Created by EalenXie on 2018/9/27 18:02.
 */
public class Originator {

    private String name;
    private String sex;
    private Integer age;

    //创建一个备份
    public Memento createMemento() {
        return new Memento(name, sex, age);
    }

    //根据备份进行rollback
    public void rollbackByMemento(Memento memento) {
        this.name = memento.getName();
        this.sex = memento.getSex();
        this.age = memento.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Originator(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
