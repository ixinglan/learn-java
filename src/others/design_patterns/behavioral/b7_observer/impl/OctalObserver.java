package others.design_patterns.behavioral.b7_observer.impl;


import others.design_patterns.behavioral.b7_observer.Observer;
import others.design_patterns.behavioral.b7_observer.Subject;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
