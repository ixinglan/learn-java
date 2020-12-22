package others.design_patterns.structural.s6_facade;

/**
 * @description: 外观模式
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
