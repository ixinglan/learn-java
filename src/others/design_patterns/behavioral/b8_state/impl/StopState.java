package others.design_patterns.behavioral.b8_state.impl;


import others.design_patterns.behavioral.b8_state.Context;
import others.design_patterns.behavioral.b8_state.State;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
