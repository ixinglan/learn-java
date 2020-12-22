package others.design_patterns.behavioral.b3_interpreter;


import others.design_patterns.behavioral.b3_interpreter.impl.AndExpression;
import others.design_patterns.behavioral.b3_interpreter.impl.OrExpression;
import others.design_patterns.behavioral.b3_interpreter.impl.TerminalExpression;

/**
 * @description: 解释器模式
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class InterpreterPatternDemo {
    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
