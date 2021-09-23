package by.itstep.cafe.dao.impl;

import by.itstep.cafe.dao.OrderDao;
import by.itstep.cafe.entity.Order;
import by.itstep.cafe.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class OrderDaoImpl implements OrderDao {
    private static SessionFactory sessionFactory;

    public OrderDaoImpl() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public void addOrder(Order order) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.save(order);
        transaction.commit();
        session.close();
    }

    @Override
    public void removeOrder(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Order order = session.get(Order.class, id);
        session.delete(order);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateOrder(Order order) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.update(order);
        transaction.commit();
        session.close();
    }

    @Override
    public List listOrders() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List orders = session.createQuery("FROM Order").list();
        transaction.commit();
        session.close();
        return orders;
    }

    @Override
    public Order getOrder(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Order order = session.get(Order.class, id);
        transaction.commit();
        session.close();
        return order;
    }
}
