package others.design_patterns.creational.c1_factory.shape;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/19
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
