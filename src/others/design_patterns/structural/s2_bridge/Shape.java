package others.design_patterns.structural.s2_bridge;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
