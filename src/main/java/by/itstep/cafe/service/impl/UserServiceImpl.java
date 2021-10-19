package by.itstep.cafe.service.impl;

import by.itstep.cafe.dao.repository.UserDao;
import by.itstep.cafe.dao.entity.User;
import by.itstep.cafe.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

import static by.itstep.cafe.Utils.*;

@Service
public class UserServiceImpl implements UserService {


    private final UserDao userDao;


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User createUser(User user) throws Exception {

        isValid(user);
        return userDao.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteById(id);
    }

    @Override
    public List<User> listUsers() {
        return userDao.findAll();
    }

    @Override
    public User findUserByName(String name) {
        return userDao.findUserByUserName(name);
    }

    private boolean isValid(User user) throws Exception {
        boolean valid = false;
        if (isPhone(user.getPhone())) {
            valid = true;
        } else {
            throw new Exception("not correct phone number");
        }
        if (isLogin(user.getUserName())) {
            valid = true;
        } else {
            throw new Exception("not correct userName");
        }
        return valid;
    }
}
