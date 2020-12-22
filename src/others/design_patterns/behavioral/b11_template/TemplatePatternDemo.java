package others.design_patterns.behavioral.b11_template;


import others.design_patterns.behavioral.b11_template.impl.Cricket;
import others.design_patterns.behavioral.b11_template.impl.Football;

/**
 * @description: 模板模式
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
