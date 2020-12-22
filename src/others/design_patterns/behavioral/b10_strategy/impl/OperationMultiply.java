package others.design_patterns.behavioral.b10_strategy.impl;


import others.design_patterns.behavioral.b10_strategy.Strategy;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
