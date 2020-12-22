package others.design_patterns.behavioral.b7_observer.impl;


import others.design_patterns.behavioral.b7_observer.Observer;
import others.design_patterns.behavioral.b7_observer.Subject;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
