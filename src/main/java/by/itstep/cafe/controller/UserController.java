package by.itstep.cafe.controller;

import by.itstep.cafe.entity.Role;
import by.itstep.cafe.entity.User;

public interface UserController {

    void createUser(User user);
    void deleteUser(int id);
    void createRole(Role role);
}
