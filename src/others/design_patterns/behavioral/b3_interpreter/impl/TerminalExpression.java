package others.design_patterns.behavioral.b3_interpreter.impl;

import others.design_patterns.behavioral.b3_interpreter.Expression;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
