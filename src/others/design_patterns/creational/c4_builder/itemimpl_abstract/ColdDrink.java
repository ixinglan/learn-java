package others.design_patterns.creational.c4_builder.itemimpl_abstract;


import others.design_patterns.creational.c4_builder.Item;
import others.design_patterns.creational.c4_builder.Packing;
import others.design_patterns.creational.c4_builder.packImpl.Bottle;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
