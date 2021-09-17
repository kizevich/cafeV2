package by.itstep.cafe.dao;

import by.itstep.cafe.entity.User;

public interface UserDao {

    User createUser(User user);

    void deleteUser(int id);
}
