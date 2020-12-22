package others.design_patterns.behavioral.b12_visitor.impl;


import others.design_patterns.behavioral.b12_visitor.ComputerPart;
import others.design_patterns.behavioral.b12_visitor.ComputerPartVisitor;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
