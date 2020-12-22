package others.design_patterns.structural.s5_decorator;


import others.design_patterns.structural.s5_decorator.impl.Circle;
import others.design_patterns.structural.s5_decorator.impl.Rectangle;
import others.design_patterns.structural.s5_decorator.impl.ShapeDecorator;

/**
 * @description: 装饰器模式
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
//        Shape redCircle = new RedShapeDecorator(new Circle());
//        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
