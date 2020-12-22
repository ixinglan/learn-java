package others.design_patterns.structural.s2_bridge;


import others.design_patterns.structural.s2_bridge.impl.GreenCircle;
import others.design_patterns.structural.s2_bridge.impl.RedCircle;

/**
 * @description: 桥接模式
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
