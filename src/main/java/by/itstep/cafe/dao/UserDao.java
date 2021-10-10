package by.itstep.cafe.dao;

import by.itstep.cafe.entity.User;

import java.util.List;

public interface UserDao {

    User findUserByName (String name);
}
