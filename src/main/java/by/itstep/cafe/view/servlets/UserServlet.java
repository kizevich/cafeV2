package by.itstep.cafe.view.servlets;


import by.itstep.cafe.controller.UserController;
import by.itstep.cafe.controller.impl.UserControllerImpl;
import by.itstep.cafe.dao.entity.Role;
import by.itstep.cafe.dao.entity.Status;
import by.itstep.cafe.dao.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "UserServlet",
        description = "JSP Servlet With Annotations",
        urlPatterns = {"/add", "/delete"}
)

public class UserServlet extends HttpServlet {

    private UserController userController = new UserControllerImpl();

    public void init(ServletConfig servletConfig) {
        try {
            super.init(servletConfig);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<User> users = userController.listUsers();
        req.setAttribute("users", users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/showUsers.jsp");
        dispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String phone = req.getParameter("phone");
        Status status = new Status("0%", 0);
        Role role = new Role("client");

        User user = new User(userName, password, phone, status, role);
        userController.createUser(user);
        req.setAttribute("userName", userName);

        doGet(req, resp);

        resp.sendRedirect("/index");

    }

    @Override
    protected void  doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setUserName(req.getParameter("name"));
        user.setPassword(req.getParameter("password"));
        user.setPhone(req.getParameter("phone"));
        Status status = userController.getUser(req.getParameter("name")).getStatus();
        user.setStatus(status);
        Role role = new Role("client");
        user.setRole(role);
        userController.updateUser(user);
        resp.sendRedirect("/index");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        userController.deleteUser(id);
        resp.sendRedirect("/index");
    }
}