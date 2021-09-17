package by.itstep.cafe.service;

import by.itstep.cafe.service.impl.*;

public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory () {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public UserService getUserService () { return new UserServiceImpl(); }

    public ProductService getProductService () { return new ProductServiceImpl(); }

    public RoleService getRoleService () { return new RoleServiceImpl(); }

    public StatusService getStatusService () { return new StatusServiceImpl(); }

    public TypeService getTypeService () { return new TypeServiceImpl(); }
}
