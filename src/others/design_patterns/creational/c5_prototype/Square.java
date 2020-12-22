package others.design_patterns.creational.c5_prototype;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
