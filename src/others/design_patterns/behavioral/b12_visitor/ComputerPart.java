package others.design_patterns.behavioral.b12_visitor;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
