package others.design_patterns.structural.s5_decorator;


import others.design_patterns.structural.s5_decorator.impl.ShapeDecorator;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }

}
