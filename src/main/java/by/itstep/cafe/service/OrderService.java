package by.itstep.cafe.service;

import by.itstep.cafe.dao.entity.Order;
import by.itstep.cafe.dao.entity.User;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    void addOrder(Order order);

    void removeOrder(int id);

    List<Order> listOrders();

    Optional<Order> getOrder(int id);

    List <Order> getOrdersByDate(String date);
}
