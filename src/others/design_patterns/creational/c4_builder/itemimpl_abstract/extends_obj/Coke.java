package others.design_patterns.creational.c4_builder.itemimpl_abstract.extends_obj;


import others.design_patterns.creational.c4_builder.itemimpl_abstract.ColdDrink;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
