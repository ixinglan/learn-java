package others.design_patterns.creational.c1_factory.shape;


import others.design_patterns.creational.c1_factory.color.Color;
import others.design_patterns.creational.c2_abstract_factory.AbstractFactory;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/19
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
