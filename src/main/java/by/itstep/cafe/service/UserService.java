package by.itstep.cafe.service;

import by.itstep.cafe.entity.User;

public interface UserService {

    void createUser(User user);

    void deleteUser(int id);
}
