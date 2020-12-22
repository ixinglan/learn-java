package others.design_patterns.creational.c5_prototype;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
