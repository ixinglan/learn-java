package others.design_patterns.behavioral.b7_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
