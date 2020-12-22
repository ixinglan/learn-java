package others.design_patterns.structural.s2_bridge.impl;


import others.design_patterns.structural.s2_bridge.DrawAPI;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
