package others.design_patterns.creational.c2_abstract_factory;


import others.design_patterns.creational.c1_factory.color.ColorFactory;
import others.design_patterns.creational.c1_factory.shape.ShapeFactory;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/19
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
