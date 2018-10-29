package name.ealen.builder.designPattern;

/**
 * Created by EalenXie on 2018/10/29 15:40.
 * 监工的主要职责 : 负责选用不同的建造者，责控制一个复杂的构建过程，由建造者本身负责实现构建过程中所用到的所有构建步骤
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 具体建造者可控
     */
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 控制（定义）一个复杂的构建过程,构建顺序可控
     */
    public void construct() {
        builder.buildName();
        builder.buildNumber();
        builder.buildPrice();
    }
}
