package by.itstep.cafe.controller.impl;


import by.itstep.cafe.controller.UserController;
import by.itstep.cafe.entity.Role;
import by.itstep.cafe.entity.User;
import by.itstep.cafe.service.ServiceFactory;
import by.itstep.cafe.service.UserService;

import java.util.List;

public class UserControllerImpl implements UserController {

    private UserService userService;

    public UserControllerImpl() {
        this.userService = ServiceFactory.getInstance().getUserService();
    }


    @Override
    public void createUser(User user) {
        userService.createUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userService.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userService.updateUser(user);
    }

    @Override
    public List listUsers() {
        return userService.listUsers();
    }

    @Override
    public User getUser(String name) {
        return userService.getUser(name);
    }
}
