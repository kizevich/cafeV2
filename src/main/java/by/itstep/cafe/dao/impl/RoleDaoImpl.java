package by.itstep.cafe.dao.impl;

import by.itstep.cafe.dao.RoleDao;
import by.itstep.cafe.entity.Role;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static by.itstep.cafe.dao.impl.ConnectionDao.*;
import static by.itstep.cafe.dao.impl.ConnectionDao.createEntity;

public class RoleDaoImpl implements RoleDao {
    @Override
    public Role createRole(Role role) {
        List<String> values = Stream.of(role.getName()).
                map(String::valueOf).collect(Collectors.toList());
        String query = "INSERT INTO role (name) " +
                "VALUES ('" + String.join("', '", values) + "')";
        role.setId(createEntity(query));
        return role;
    }
}
