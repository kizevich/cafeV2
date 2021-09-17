package by.itstep.cafe.controller.impl;

import by.itstep.cafe.controller.RoleController;
import by.itstep.cafe.entity.Role;
import by.itstep.cafe.service.RoleService;
import by.itstep.cafe.service.ServiceFactory;

public class RoleControllerImpl implements RoleController {

    private RoleService roleService;

    public RoleControllerImpl() {
        this.roleService = ServiceFactory.getInstance().getRoleService();
    }

    @Override
    public void createRole(Role role) {
        roleService.createRole(role);
    }
}
