package others.design_patterns.behavioral.b8_state;


import others.design_patterns.behavioral.b8_state.impl.StartState;
import others.design_patterns.behavioral.b8_state.impl.StopState;

/**
 * @description: 状态模式
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
