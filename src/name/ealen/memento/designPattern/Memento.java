package name.ealen.memento.designPattern;

/**
 * Created by EalenXie on 2018/9/27 18:03.
 */
public class Memento {
    private String name;
    private String sex;
    private Integer age;

    public Memento(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
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

}
