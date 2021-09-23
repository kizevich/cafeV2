package by.itstep.cafe.controller;

import by.itstep.cafe.entity.Role;
import by.itstep.cafe.entity.User;

import java.util.List;

public interface UserController {

    void createUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    List listUsers();

    User getUser(String name);

}
