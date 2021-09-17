package by.itstep.cafe;

import by.itstep.cafe.controller.UserController;
import by.itstep.cafe.controller.impl.UserControllerImpl;
import by.itstep.cafe.entity.User;

public class Run {
    public static void main(String[] args) {
        User user = new User("client", "password", "12345", 1, 1);

        UserController controller = new UserControllerImpl();
        controller.createUser(user);
    }
}
