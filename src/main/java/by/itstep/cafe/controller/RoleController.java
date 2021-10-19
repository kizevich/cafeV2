package by.itstep.cafe.controller;

import by.itstep.cafe.dao.entity.Role;

import java.util.List;

public interface RoleController {

    void addRole(Role role);

    void removeRole(int id);

    void updateRole(Role role);

    List listRoles();

    Role getRole(String name);
}
