package others.design_patterns.creational.c2_abstract_factory;


import others.design_patterns.creational.c1_factory.color.Color;
import others.design_patterns.creational.c1_factory.shape.Shape;

/**
 * @description: 抽象工厂模式
 * @author:zhaojq
 * @date: 2020/5/19
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
