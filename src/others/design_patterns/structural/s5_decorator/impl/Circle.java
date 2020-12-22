package others.design_patterns.structural.s5_decorator.impl;

import others.design_patterns.structural.s5_decorator.Shape;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
