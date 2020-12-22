package others.design_patterns.creational.c5_prototype;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
