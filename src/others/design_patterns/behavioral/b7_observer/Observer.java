package others.design_patterns.behavioral.b7_observer;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
