package by.itstep.cafe.controller.impl;

import by.itstep.cafe.controller.RoleController;
import by.itstep.cafe.entity.Role;
import by.itstep.cafe.service.RoleService;
import by.itstep.cafe.service.ServiceFactory;

import java.util.List;

public class RoleControllerImpl implements RoleController {

    private RoleService roleService;

    public RoleControllerImpl() {
        this.roleService = ServiceFactory.getInstance().getRoleService();
    }


    @Override
    public void addRole(Role role) {
        roleService.addRole(role);
    }

    @Override
    public void removeRole(int id) {
        roleService.removeRole(id);
    }

    @Override
    public void updateRole(Role role) {
        roleService.updateRole(role);
    }

    @Override
    public List listRoles() {
        return roleService.listRoles();
    }

    @Override
    public Role getRole(String name) {
        return roleService.getRole(name);
    }
}
