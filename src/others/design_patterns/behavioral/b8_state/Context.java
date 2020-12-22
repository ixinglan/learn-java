package others.design_patterns.behavioral.b8_state;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
