package others.design_patterns.creational.c4_builder.itemimpl_abstract.extends_obj;


import others.design_patterns.creational.c4_builder.itemimpl_abstract.Burger;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
