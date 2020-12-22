package others.design_patterns.behavioral.b12_visitor.impl;


import others.design_patterns.behavioral.b12_visitor.ComputerPart;
import others.design_patterns.behavioral.b12_visitor.ComputerPartVisitor;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
