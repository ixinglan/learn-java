package others.design_patterns.behavioral.b5_mediator;

/**
 * @description: 中介者模式
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
