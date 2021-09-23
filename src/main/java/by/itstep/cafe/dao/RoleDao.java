package by.itstep.cafe.dao;

import by.itstep.cafe.entity.Role;

import java.util.List;

public interface RoleDao {

    void addRole(Role role);

    void removeRole(int id);

    void updateRole(Role role);

    List listRoles();

    Role getRole(String name);
}
