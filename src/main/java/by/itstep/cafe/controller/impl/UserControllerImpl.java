package by.itstep.cafe.controller.impl;


import by.itstep.cafe.controller.UserController;
import by.itstep.cafe.entity.Role;
import by.itstep.cafe.entity.User;
import by.itstep.cafe.service.ServiceFactory;
import by.itstep.cafe.service.UserService;

public class UserControllerImpl implements UserController {

    private UserService userService;

    public UserControllerImpl () {

        this.userService = ServiceFactory.getInstance().getUserService();
    }


    public void createUser(User user) {
        userService.createUser(user);
    }

    public void deleteUser(int id) {

    }

    @Override
    public void createRole(Role role) {

    }
}
