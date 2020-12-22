package others.design_patterns.behavioral.b2_command;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
