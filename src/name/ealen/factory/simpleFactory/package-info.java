/**
 * 简单工厂模式(静态工厂模式) : simpleFactory
 * 声明 : 类的创建型模式,通过定义一个类来负责创建其他类的实例,被创建的实例通常都具有共同的父类
 * 工厂(FactoryCreator) : 简单工厂的核心具体类,它负责创建所有实例的内部逻辑,工厂类可以被外部直接调用,创建所需的实例对象
 * 抽象角色(Product) : 简单工厂模式所有创建的实例对象的共同的父类，它负责描述所有实例共有的公共接口
 * 实例对象(Concrete Product) : 简单工厂模式所有创建的实例对象
 */
package name.ealen.factory.simpleFactory;