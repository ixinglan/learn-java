package others.design_patterns.creational.c1_factory.color;


import others.design_patterns.creational.c1_factory.shape.Shape;
import others.design_patterns.creational.c2_abstract_factory.AbstractFactory;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/19
 */
public class ColorFactory extends AbstractFactory {

    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
