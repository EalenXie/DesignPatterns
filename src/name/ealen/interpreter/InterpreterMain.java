package name.ealen.interpreter;

import name.ealen.interpreter.designPattern.AbstractExpression;
import name.ealen.interpreter.designPattern.Context;
import name.ealen.interpreter.designPattern.NonTerminalExpression;
import name.ealen.interpreter.designPattern.TerminalExpression;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EalenXie on 2018/11/14 10:01.
 */
public class InterpreterMain {

    @Test
    public void designPattern() {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        for (AbstractExpression expression : list) {
            expression.interpret(context);
        }
    }


}
