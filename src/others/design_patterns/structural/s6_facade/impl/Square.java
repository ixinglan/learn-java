package others.design_patterns.structural.s6_facade.impl;

import others.design_patterns.structural.s6_facade.Shape;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
