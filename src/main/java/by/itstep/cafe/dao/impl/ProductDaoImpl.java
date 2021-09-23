package by.itstep.cafe.dao.impl;

import by.itstep.cafe.dao.ProductDao;
import by.itstep.cafe.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    private static SessionFactory sessionFactory;

    public ProductDaoImpl() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public void addProduct(Product product) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.save(product);
        transaction.commit();
        session.close();
    }

    @Override
    public void removeProduct(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Product product = session.get(Product.class, id);
        session.delete(product);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateProduct(Product product) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.update(product);
        transaction.commit();
        session.close();
    }

    @Override
    public List listProducts() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List products = session.createQuery("FROM Product").list();
        transaction.commit();
        session.close();
        return products;
    }

    @Override
    public Product getProduct(String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Product where name=:name");
        query.setParameter("name", name);
        Product product = (Product) query.uniqueResult();
        transaction.commit();
        session.close();
        return product;
    }
}
