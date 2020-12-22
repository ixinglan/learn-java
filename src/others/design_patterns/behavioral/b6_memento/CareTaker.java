package others.design_patterns.behavioral.b6_memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
