/**
 * 备忘录模式 : Memento
 * 声明/作用 : 保存对象的内部状态,并在需要的时候(undo/rollback) 恢复到对象以前的状态
 * 适用场景 : 一个对象需要保存状态,并且可通过undo或者rollback恢复到以前的状态时,可以使用备忘录模式
 * <p>
 * 经典场景 : 某时刻游戏存档恢复记录
 * <p>
 * 需要被保存内部状态以便恢复的这个类 叫做 : Originator 发起人(原生者)
 * 用来保存Originator内部对象的类 叫做 : Memento  备忘录(回忆者) 它由Originator创建
 * 负责管理备忘录Memento的类叫做 :  Caretaker(管理者),它不能对Memento的内容进行访问或者操作。
 */
package name.ealen.memento;