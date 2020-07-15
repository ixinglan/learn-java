package reflection.ref_03;

import java.io.Serializable;

public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    Creature() {
    }

    private void breath() {
        System.out.println("爱是一道光");
    }

    public void eat() {
        System.out.println("吃点东西吧");
    }

}
