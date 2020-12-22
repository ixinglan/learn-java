package others.design_patterns.structural.s6_facade;


import others.design_patterns.structural.s6_facade.impl.Circle;
import others.design_patterns.structural.s6_facade.impl.Rectangle;
import others.design_patterns.structural.s6_facade.impl.Square;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
