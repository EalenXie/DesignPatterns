/**
 * 工厂方法模式(多态工厂模式) : factory method
 * 声明 : 类的创建型模式,定义创建实例的接口,实际创建工作推迟到子类当中
 * 工厂(FactoryCreator) : 工厂方法的核心抽象接口,任何厂类都实现这个接口
 * 具体工厂(FactoryConcreteCreator) : 具体工厂类是抽象工厂的接口的一个实现,负责实例化产品对象
 * 抽象角色(Product) : 所有创建的实例对象的共同的父类，它负责描述所有实例共有的公共接口
 * 实例对象(Concrete Product) : 工厂模式所有具体工厂创建的实例对象
 * <p>
 * 工厂方法模式针对的是一个产品等级结构
 */


package name.ealen.factory.factoryMethod;