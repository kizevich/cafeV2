package by.itstep.cafe.service.impl;

import by.itstep.cafe.dao.DaoFactory;
import by.itstep.cafe.dao.UserDao;
import by.itstep.cafe.entity.User;
import by.itstep.cafe.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl () {
        this.userDao = DaoFactory.getInstance().getUserDao();
    }

    @Override
    public void createUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.removeUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public List listUsers() {
        return userDao.listUsers();
    }

    @Override
    public User getUser(String name) {
        return userDao.getUser(name);
    }
}
