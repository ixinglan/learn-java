package others.design_patterns.creational.c1_factory.shape;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/19
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
