package by.itstep.cafe.dao;

import by.itstep.cafe.dao.impl.*;

public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory () {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public UserDao getUserDao () {
        return new UserDaoImpl();
    }

    public ProductDao getProductDao () { return new ProductDaoImpl(); }

    public RoleDao getRoleDao () { return new RoleDaoImpl(); }

    public StatusDao geStatusDao () { return new StatusDaoImpl(); }

    public TypeDao getTypeDao () { return new TypeDaoImpl(); }

    public OrderDao getOrderDao () { return new OrderDaoImpl(); }

}
