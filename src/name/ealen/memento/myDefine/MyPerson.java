package name.ealen.memento.myDefine;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by EalenXie on 2018/9/27 15:44.
 * 自定义 实现备忘录(备份者)模式
 * 分为两种情况 : 单个备份和多个备份的情况
 * 注意 : 备份 始终是 备份当前这个MyPerson的当前状态
 */
public class MyPerson {

    private String name;
    private String sex;
    private Integer age;

    private Map<String, Backup> backUps = new HashMap<>(); //一个或者多个备份录

    //一个备份情况,根据当前对象的状态,创建一个备份 Backup
    public void createDefaultBackup() {
        this.backUps.put("default", new Backup(name, sex, age));
    }


    //一个备份情况,恢复对象 根据备份 进行 undo/rollback
    public void rollbackByDefault() {
        if (backUps.size() != 0) {
            Backup backUp = this.backUps.get("default");
            this.name = backUp.getName();
            this.sex = backUp.getSex();
            this.age = backUp.getAge();
        }
    }

    //多个备份情况,根据当前对象的状态,按照备份名字去创建一个备份 Backup
    public void createBackupByName(String backUpName) {
        this.backUps.put(backUpName, new Backup(name, sex, age));
    }

    //多个备份情况,恢复对象 根据备份名 进行 undo/rollback
    public void rollbackByBackupName(String backUpName) {
        Backup backUp = this.backUps.get(backUpName);
        if (backUp != null) {
            this.name = backUp.getName();
            this.sex = backUp.getSex();
            this.age = backUp.getAge();
        }
    }

    public MyPerson(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public MyPerson() {
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


    @Override
    public String toString() {
        return "MyPerson{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 内部的备份者
     */
    private static class Backup {
        private String name;
        private String sex;
        private Integer age;

        private Backup(String name, String sex, Integer age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        private String getName() {
            return name;
        }

        private String getSex() {
            return sex;
        }

        private Integer getAge() {
            return age;
        }
    }
}
