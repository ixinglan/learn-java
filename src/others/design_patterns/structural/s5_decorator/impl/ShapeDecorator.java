package others.design_patterns.structural.s5_decorator.impl;

import others.design_patterns.structural.s5_decorator.Shape;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
