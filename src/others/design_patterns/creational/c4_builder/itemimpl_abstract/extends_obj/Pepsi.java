package others.design_patterns.creational.c4_builder.itemimpl_abstract.extends_obj;


import others.design_patterns.creational.c4_builder.itemimpl_abstract.ColdDrink;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Repsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
