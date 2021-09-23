package by.itstep.cafe.dao.impl;

import by.itstep.cafe.dao.RoleDao;
import by.itstep.cafe.entity.Role;
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
public class RoleDaoImpl implements RoleDao, Serializable {
    private static SessionFactory sessionFactory;

    public RoleDaoImpl() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public void addRole(Role role) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.save(role);
        transaction.commit();
        session.close();
    }

    @Override
    public void removeRole(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Role role = session.get(Role.class, id);
        session.delete(role);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateRole(Role role) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.update(role);
        transaction.commit();
        session.close();
    }

    @Override
    public List listRoles() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List roles = session.createQuery("FROM Role").list();
        transaction.commit();
        session.close();
        return roles;
    }

    @Override
    public Role getRole(String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Role where name=:name");
        query.setParameter("name", name);
        Role role = (Role) query.uniqueResult();
        transaction.commit();
        session.close();
        return role;
    }
}
