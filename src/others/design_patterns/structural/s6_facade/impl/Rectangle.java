package others.design_patterns.structural.s6_facade.impl;

import others.design_patterns.structural.s6_facade.Shape;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
