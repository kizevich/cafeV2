package by.itstep.cafe.service;

import by.itstep.cafe.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    void deleteUser(int id);

    List listUsers();

    User findUserByName(String name);
}
