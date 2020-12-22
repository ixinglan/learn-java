package others.design_patterns.behavioral.b6_memento;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
