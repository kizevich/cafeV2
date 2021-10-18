package by.itstep.cafe.service.impl;

import by.itstep.cafe.dao.RoleDao;
import by.itstep.cafe.entity.Role;
import by.itstep.cafe.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    public RoleServiceImpl() {
        this.roleDao = DaoFactory.getInstance().getRoleDao();
    }


    @Override
    public void addRole(Role role) {
        roleDao.addRole(role);
    }

    @Override
    public void removeRole(int id) {
        roleDao.removeRole(id);
    }

    @Override
    public void updateRole(Role role) {
        roleDao.updateRole(role);
    }

    @Override
    public List listRoles() {
        return roleDao.listRoles();
    }

    @Override
    public Role getRole(String name) {
        return roleDao.getRole(name);
    }
}
