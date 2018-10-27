package name.ealen.prototype;

import name.ealen.prototype.designPattern.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EalenXie on 2018/10/25 11:47.
 */
public class PrototypeMain {

    @Test
    public void designPattern() throws Exception {

        /*
         * 浅克隆
         */
        Person ealen = new Person();
        ealen.setAge(22);
        ealen.setName("Ealen");
        List<String> friends = new ArrayList<>();
        friends.add("ZhuYuHan");
        friends.add("ZhenPei");
        ealen.setFriends(friends);

        //克隆对象 1
        Person ealen2 = (Person) ealen.clone();
        //克隆的一定是一个新的实例
        System.out.println(ealen == ealen2);
        //浅克隆指向的引用其实是相同的,即引用是没有被克隆的
        System.out.println(ealen.getFriends() == ealen2.getFriends());
        System.out.println("-----------寂寞的分界-------------");

        /*
         * 深克隆
         */

        //克隆对象 2
        Person ealen3 = ealen.deepClone();
        System.out.println(ealen == ealen3);
        //浅克隆指向的引用也不同的,即引用也被克隆了
        System.out.println(ealen.getFriends() == ealen3.getFriends());
    }
}
