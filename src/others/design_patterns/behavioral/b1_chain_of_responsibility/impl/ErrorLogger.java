package others.design_patterns.behavioral.b1_chain_of_responsibility.impl;


import others.design_patterns.behavioral.b1_chain_of_responsibility.AbstractLogger;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::Logger: " + message);
    }
}
