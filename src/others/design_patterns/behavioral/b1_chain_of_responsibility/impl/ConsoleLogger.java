package others.design_patterns.behavioral.b1_chain_of_responsibility.impl;

import others.design_patterns.behavioral.b1_chain_of_responsibility.AbstractLogger;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console::Logger: " + message);
    }
}
