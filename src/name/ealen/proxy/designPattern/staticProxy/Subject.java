package name.ealen.proxy.designPattern.staticProxy;

/**
 * Created by EalenXie on 2018/11/2 10:16.
 * 代理模式(静态)与装饰者虽然在结构上基本上一模一样，但两者却有真正区别 : 关注重心不一样，目的不一样
 * 装饰者目的 : 原有对象被装饰者增强；我们的目的通常是得到被增强后的装饰者对象。(完成装饰增强的真正意义)
 * 代理模式目的 : 原有对象被代理，我们的目的是让原有对象行为不受到影响，原有对象的行为或额外的动作交由代理对象完成。(完成代理的真正意义)
 * 装饰者关注重心 : 根据原有对象被增强的装饰对象，主要关心装饰后的行为。(最终主要功能由装饰对象决定)
 * 代理模式关注重心 : 原有对象行为不变，代理对象帮忙代理或扩展原有对象的行为，主要还是关心原有对象的行为。(最终主要功能仍然由原有对象决定)
 */
public interface Subject {

    public void operation();

}
