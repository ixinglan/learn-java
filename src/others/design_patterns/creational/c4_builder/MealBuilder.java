package others.design_patterns.creational.c4_builder;


import others.design_patterns.creational.c4_builder.itemimpl_abstract.extends_obj.ChickenBurger;
import others.design_patterns.creational.c4_builder.itemimpl_abstract.extends_obj.Coke;
import others.design_patterns.creational.c4_builder.itemimpl_abstract.extends_obj.Pepsi;
import others.design_patterns.creational.c4_builder.itemimpl_abstract.extends_obj.VegBurger;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
