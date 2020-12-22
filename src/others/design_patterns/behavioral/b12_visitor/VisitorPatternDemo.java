package others.design_patterns.behavioral.b12_visitor;


import others.design_patterns.behavioral.b12_visitor.impl.Computer;
import others.design_patterns.behavioral.b12_visitor.impl.ComputerPartDisplayVisitor;

/**
 * @description: 访问者模式
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
