package others.design_patterns.creational.c1_factory.color;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/19
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
