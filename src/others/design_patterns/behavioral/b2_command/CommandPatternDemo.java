package others.design_patterns.behavioral.b2_command;


import others.design_patterns.behavioral.b2_command.impl.BuyStock;
import others.design_patterns.behavioral.b2_command.impl.SellStock;

/**
 * @description: 命令模式
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
