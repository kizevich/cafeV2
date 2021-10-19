package by.itstep.cafe.service;

import by.itstep.cafe.dao.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user) throws Exception;

    void deleteUser(int id);

    List listUsers();

    User findUserByName(String name);
}
