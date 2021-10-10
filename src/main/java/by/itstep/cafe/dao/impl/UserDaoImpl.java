package by.itstep.cafe.dao.impl;

import by.itstep.cafe.dao.UserDao;
import by.itstep.cafe.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.annotation.ManagedBean;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@ManagedBean
public class UserDaoImpl extends EntityDaoImpl<User, Integer> implements UserDao {

    public UserDaoImpl(Class entityType) {
        super(entityType);
    }

    @Override
    public User findUserByName(String name) {
        session = sessionFactory.openSession();
        Query query = session.createQuery(
                "SElECT p FROM User p WHERE p.userName = :name", User.class);
        query.setParameter("name", name);
        User user = (User) query.getSingleResult();
        session.close();
        return user;
    }
}