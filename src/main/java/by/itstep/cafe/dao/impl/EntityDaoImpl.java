package by.itstep.cafe.dao.impl;

import org.apache.maven.SessionScoped;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Collections;
import java.util.List;

@SessionScoped
public abstract class EntityDaoImpl <T,R> {

    protected static SessionFactory sessionFactory;
    private Class<T> entityType;
    protected Session session;

    public EntityDaoImpl(Class<T> entityType) {
        this.entityType = entityType;
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public T add(T entity){
        return add(Collections.singletonList(entity)).get(0);
    }


    List<T> add(List<T> entities){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        for (T t: entities) {
            session.save(t);
        }
        session.flush();
        session.getTransaction().commit();
        session.close();
        return entities;
    }

    void remove(T entity){
        remove(Collections.singletonList(entity));
    }

    void remove(List<T> entities){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        for (T t: entities) {
            session.remove(t);
        }
        session.flush();
        session.getTransaction().commit();
        session.clear();
        session.close();
    }

    T update(T entities){
        return update(Collections.singletonList(entities)).get(0);
    }

    List<T> update(List<T> entities){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        for (T t: entities) {
            session.update(t);
        }
        session.flush();
        session.getTransaction().commit();
        session.close();
        return entities;
    }

    List findAll(){
        session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(entityType);
        Root<T> entityRoot = criteriaQuery.from(entityType);
        List<T> queryResult = session.createQuery(criteriaQuery.select(entityRoot))
                .getResultList();
        session.close();
        return queryResult;
    }

    T find(R id) {
        session = sessionFactory.openSession();
        return session.find(entityType, id);
    }
}
