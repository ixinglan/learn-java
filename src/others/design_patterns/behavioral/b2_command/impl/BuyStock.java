package others.design_patterns.behavioral.b2_command.impl;


import others.design_patterns.behavioral.b2_command.Order;
import others.design_patterns.behavioral.b2_command.Stock;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
