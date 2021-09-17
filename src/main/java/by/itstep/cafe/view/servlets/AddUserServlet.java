package by.itstep.cafe.view.servlets;


import by.itstep.cafe.controller.UserController;
import by.itstep.cafe.controller.impl.UserControllerImpl;
import by.itstep.cafe.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "AddUserServlet",
        description = "JSP Servlet With Annotations",
        urlPatterns = {"/add"}
)

public class AddUserServlet extends HttpServlet {

    private UserController userController = new UserControllerImpl();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = req.getParameter("userName");

        System.out.println(userName);

        String password = req.getParameter("password");
        String phone = req.getParameter("phone");
        int statusId = Integer.parseInt(req.getParameter("statusId"));
        int roleId = Integer.parseInt(req.getParameter("roleId"));

        User user = new User(userName, password, phone, statusId, roleId);

        System.out.println(user.toString());
        userController.createUser(user);

        System.out.println("done");
        req.setAttribute("userName", userName);
        System.out.println("done");

        doGet(req, resp);
        System.out.println("done");

    }
}
