package by.itstep.cafe.dao;

import by.itstep.cafe.entity.Order;
import java.util.List;

public interface OrderDao {

    void addOrder(Order order);

    void removeOrder(int id);

    void updateOrder(Order order);

    List<Order> listOrders();

    Order getOrder(int id);
}
