package by.itstep.cafe.service.impl;

import by.itstep.cafe.dao.DaoFactory;
import by.itstep.cafe.dao.OrderDao;
import by.itstep.cafe.entity.Order;
import by.itstep.cafe.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao;

    public OrderServiceImpl () {
        this.orderDao = DaoFactory.getInstance().getOrderDao();
    }

    @Override
    public void addOrder(Order order) {
        orderDao.addOrder(order);
    }

    @Override
    public void removeOrder(int id) {
        orderDao.removeOrder(id);
    }

    @Override
    public void updateOrder(Order order) {
        orderDao.updateOrder(order);
    }

    @Override
    public List<Order> listOrders() {
        return orderDao.listOrders();
    }

    @Override
    public Order getOrder(int id) {
        return orderDao.getOrder(id);
    }
}
