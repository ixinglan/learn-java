package others.design_patterns.behavioral.b12_visitor;


import others.design_patterns.behavioral.b12_visitor.impl.Computer;
import others.design_patterns.behavioral.b12_visitor.impl.Keyboard;
import others.design_patterns.behavioral.b12_visitor.impl.Monitor;
import others.design_patterns.behavioral.b12_visitor.impl.Mouse;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
