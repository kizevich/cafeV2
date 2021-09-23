package by.itstep.cafe.dao.impl;

import by.itstep.cafe.dao.StatusDao;
import by.itstep.cafe.entity.Status;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class StatusDaoImpl implements StatusDao {

    private static SessionFactory sessionFactory;

    public StatusDaoImpl() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public void addStatus(Status status) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.save(status);
        transaction.commit();
        session.close();
    }

    @Override
    public void removeStatus(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Status status = session.get(Status.class, id);
        session.delete(status);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateStatus(Status status) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.update(status);
        transaction.commit();
        session.close();
    }

    @Override
    public List listStatuses() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List statuses = session.createQuery("FROM Status ").list();
        transaction.commit();
        session.close();
        return statuses;
    }

    @Override
    public Status getStatus(String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Status where name=:name");
        query.setParameter("name", name);
        Status status = (Status) query.uniqueResult();
        transaction.commit();
        session.close();
        return status;
    }
}
