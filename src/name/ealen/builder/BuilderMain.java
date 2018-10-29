package name.ealen.builder;

import name.ealen.builder.designPattern.Builder;
import name.ealen.builder.designPattern.ConcreteBuilder;
import name.ealen.builder.designPattern.Director;
import name.ealen.builder.designPattern.Product;
import name.ealen.builder.innerClass.Computer;
import org.junit.Test;

/**
 * Created by EalenXie on 2018/10/29 15:11.
 */
public class BuilderMain {


    /**
     * 标准实现
     */
    @Test
    public void designPattern() {
        Builder builder = new ConcreteBuilder();         //建造者
        Director director = new Director(builder);       //监工 选择 建造者
        director.construct();                            //监工 指定建造顺序 建造实例(监工负责监督，建造者实际建造)
        Product product = builder.getProduct();          //建造者 完成了建造后 获取最终生成结果
        System.out.println(product);
    }


    /**
     * 内部类 builder模式，替换掉getter/setter方法 初始化实例对象
     */
    @Test
    public void createComputer() {
        Computer computer = new Computer.Builder()
                .withCpu("三星")
                .withMouse("联想")
                .withMainboard("戴尔")
                .build();
        System.out.println(computer);
    }
}
