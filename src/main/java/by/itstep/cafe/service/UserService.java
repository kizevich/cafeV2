package by.itstep.cafe.service;

import by.itstep.cafe.entity.User;

import java.util.List;

public interface UserService {

    void createUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    List listUsers();

    User getUser(String name);
}
