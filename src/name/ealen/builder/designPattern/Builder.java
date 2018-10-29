package name.ealen.builder.designPattern;

/**
 * Created by EalenXie on 2018/10/29 15:41.
 */
public interface Builder {

    public void buildName();

    public void buildPrice();

    public void buildNumber();

    public Product getProduct();

}
