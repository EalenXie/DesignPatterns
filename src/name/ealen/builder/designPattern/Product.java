package name.ealen.builder.designPattern;

/**
 * Created by EalenXie on 2018/10/29 15:41.
 */
public class Product {

    private String name;

    private double price;

    private Integer number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
