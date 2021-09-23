package by.itstep.cafe.controller.impl;

import by.itstep.cafe.controller.OrderController;
import by.itstep.cafe.entity.Order;
import by.itstep.cafe.service.OrderService;
import by.itstep.cafe.service.ProductService;
import by.itstep.cafe.service.ServiceFactory;

import java.util.List;

public class OrderControllerImpl implements OrderController {

    private OrderService orderService;

    public OrderControllerImpl() {
        this.orderService = ServiceFactory.getInstance().geOrderService();
    }

    @Override
    public void addOrder(Order order) {
        orderService.addOrder(order);
    }

    @Override
    public void removeOrder(int id) {
        orderService.removeOrder(id);
    }

    @Override
    public void updateOrder(Order order) {
        orderService.updateOrder(order);
    }

    @Override
    public List<Order> listOrders() {
        return orderService.listOrders();
    }

    @Override
    public Order getOrder(int id) {
        return orderService.getOrder(id);
    }
}
