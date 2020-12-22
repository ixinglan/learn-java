package others.design_patterns.creational.c4_builder.itemimpl_abstract;


import others.design_patterns.creational.c4_builder.Item;
import others.design_patterns.creational.c4_builder.Packing;
import others.design_patterns.creational.c4_builder.packImpl.Wrapper;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
