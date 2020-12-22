package others.design_patterns.behavioral.b7_observer;


import others.design_patterns.behavioral.b7_observer.impl.BinaryObserver;
import others.design_patterns.behavioral.b7_observer.impl.HexaObserver;
import others.design_patterns.behavioral.b7_observer.impl.OctalObserver;

/**
 * @description: 观察者模式
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("");
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
