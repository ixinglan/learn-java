package others.design_patterns.behavioral.b3_interpreter.impl;


import others.design_patterns.behavioral.b3_interpreter.Expression;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class AndExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
