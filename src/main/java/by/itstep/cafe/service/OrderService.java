package by.itstep.cafe.service;

import by.itstep.cafe.entity.Order;

import java.util.List;

public interface OrderService {
    void addOrder(Order order);

    void removeOrder(int id);

    void updateOrder(Order order);

    List<Order> listOrders();

    Order getOrder(int id);
}
