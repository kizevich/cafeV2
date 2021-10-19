package by.itstep.cafe.controller;

import by.itstep.cafe.dao.entity.Order;

import java.util.List;

public interface OrderController {
    void addOrder(Order order);

    void removeOrder(int id);

    void updateOrder(Order order);

    List<Order> listOrders();

    Order getOrder(int id);
}
