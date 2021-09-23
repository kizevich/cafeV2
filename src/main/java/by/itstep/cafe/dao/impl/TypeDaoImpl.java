package by.itstep.cafe.dao.impl;

import by.itstep.cafe.dao.TypeDao;
import by.itstep.cafe.entity.Type;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class TypeDaoImpl implements TypeDao, Serializable {

    private static SessionFactory sessionFactory;

    public TypeDaoImpl() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public void addType(Type type) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.save(type);
        transaction.commit();
        session.close();
    }

    @Override
    public void removeType(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Type type = session.get(Type.class, id);
        session.delete(type);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateType(Type type) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.update(type);
        transaction.commit();
        session.close();
    }

    @Override
    public List listTypes() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List types = session.createQuery("FROM Type").list();
        transaction.commit();
        session.close();
        return types;
    }

    @Override
    public Type getType(String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Type where name=:name");
        query.setParameter("name", name);
        Type type = (Type) query.uniqueResult();
        transaction.commit();
        session.close();
        return type;
    }
}
