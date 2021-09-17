package by.itstep.cafe.dao.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Objects;
import java.util.Properties;

public class ConnectionDao {

    static Connection connection;

    public static void getConnection(String propertyName) {
        String driverClass;
        String url;
        String user;
        String password;
        try {
            String rootPath = Objects.requireNonNull(Thread.currentThread()
                    .getContextClassLoader().getResource("")).getPath();
            String path = rootPath + propertyName + ".properties";

            Properties dbProperties = new Properties();
            dbProperties.load(new FileInputStream(path));

            driverClass = dbProperties.getProperty("connection.driver_class");
            url = dbProperties.getProperty("connection.url");
            user = dbProperties.getProperty("connection.username");
            password = dbProperties.getProperty("connection.password");
            Class.forName(driverClass);
            System.out.println(driverClass);
            connection = DriverManager.getConnection(url, user, password);
        } catch (IOException | SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void closeConnection(){
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static int createEntity(String query) {
        getConnection("database");
        if (connection != null) {
            Savepoint savepoint = null;

            try {
                savepoint = connection.setSavepoint();
                connection.setAutoCommit(false);
                PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                statement.executeUpdate();
                connection.commit();
                ResultSet res = statement.getGeneratedKeys();
                res.next();
                return res.getInt(1);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                try {
                    connection.rollback(savepoint);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } finally {
                closeConnection();
            }
        }
        return -1;
    }
}
