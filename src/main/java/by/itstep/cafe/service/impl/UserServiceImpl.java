package by.itstep.cafe.service.impl;

import by.itstep.cafe.dao.UserDao;
import by.itstep.cafe.entity.User;
import by.itstep.cafe.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    private UserDao userDao;


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User createUser(User user) {
        return userDao.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteById(id);
    }

    @Override
    public List listUsers() {
        return userDao.findAll();
    }

    @Override
    public User findUserByName(String name) {
        return userDao.findUserByUserName(name);
    }
}
