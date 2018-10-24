/**
 * 抽象工厂模式 : (abstractFactory)
 * 声明 : 类的创建型模式,为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。
 * 工厂(FactoryCreator) : 抽象工厂的核心,包含对多个产品结构的声明,任何厂类都实现这个接口
 * 具体工厂(FactoryConcreteCreator) : 具体工厂类是抽象工厂的接口的一个实现,负责实例化产品族的产品对象
 * 抽象角色(Product) : 所有创建的实例对象的共同的父类，它负责描述所有实例共有的公共接口
 * 实例对象(Concrete Product) : 工厂模式所有具体工厂创建的实例对象
 * <p>
 * 抽象工厂模式针对的是多个产品等级结构
 */


package name.ealen.factory.abstractFactory;