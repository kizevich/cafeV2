package by.itstep.cafe.service.impl;

import by.itstep.cafe.dao.DaoFactory;
import by.itstep.cafe.dao.RoleDao;
import by.itstep.cafe.entity.Role;
import by.itstep.cafe.service.RoleService;

public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    public RoleServiceImpl() {
        this.roleDao = DaoFactory.getInstance().getRoleDao();
    }

    @Override
    public void createRole(Role role) {
        roleDao.createRole(role);
    }
}
