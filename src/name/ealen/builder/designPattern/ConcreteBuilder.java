package name.ealen.builder.designPattern;

/**
 * Created by EalenXie on 2018/10/29 15:42.
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();


    @Override
    public void buildName() {    //构建产品名字
        product.setName("电脑");
    }

    @Override
    public void buildPrice() {   //构建产品价格
        product.setPrice(5000.0);
    }

    @Override
    public void buildNumber() {  //构建产品数量
        product.setNumber(10);
    }

    @Override
    public Product getProduct() {
        return product;
    }

}
