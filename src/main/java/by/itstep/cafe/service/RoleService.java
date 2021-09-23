package by.itstep.cafe.service;

import by.itstep.cafe.entity.Role;

import java.util.List;

public interface RoleService {

    void addRole(Role role);

    void removeRole(int id);

    void updateRole(Role role);

    List listRoles();

    Role getRole(String name);

}
