package others.design_patterns.creational.c1_factory;


import others.design_patterns.creational.c1_factory.color.Color;
import others.design_patterns.creational.c1_factory.color.ColorFactory;
import others.design_patterns.creational.c1_factory.shape.Shape;
import others.design_patterns.creational.c1_factory.shape.ShapeFactory;

/**
 * @description: 工厂模式
 * @author:zhaojq
 * @date: 2020/5/19
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //调用 Circle 的 draw 方法
        shape1.draw();
        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        //调用 Rectangle 的 draw 方法
        shape2.draw();
        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        //调用 Square 的 draw 方法
        shape3.draw();

        ColorFactory colorFactory = new ColorFactory();
        Color color1 = colorFactory.getColor("RED");
        Color color2 = colorFactory.getColor("BLUE");
        Color color3 = colorFactory.getColor("GREEN");

        color1.fill();
        color2.fill();
        color3.fill();
    }
}
