package others.design_patterns.behavioral.b10_strategy;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
