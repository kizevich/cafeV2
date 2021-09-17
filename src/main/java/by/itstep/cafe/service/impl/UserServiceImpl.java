package by.itstep.cafe.service.impl;

import by.itstep.cafe.dao.DaoFactory;
import by.itstep.cafe.dao.UserDao;
import by.itstep.cafe.entity.User;
import by.itstep.cafe.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl () {
        this.userDao = DaoFactory.getInstance().getUserDao();
    }


    public void createUser(User user) {
        userDao.createUser(user);
    }

    public void deleteUser(int id) {

    }
}
