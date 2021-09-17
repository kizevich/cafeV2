package by.itstep.cafe.dao.impl;

import by.itstep.cafe.dao.UserDao;
import by.itstep.cafe.entity.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static by.itstep.cafe.dao.impl.ConnectionDao.*;
import static by.itstep.cafe.dao.impl.ConnectionDao.createEntity;

public class UserDaoImpl implements UserDao {

    @Override
    public User createUser(User user) {
        List <String> values = Stream.of(user.getUserName(), user.getPassword(), user.getPhone(),
                user.getStatusId(), user.getRoleId()).
                map(String::valueOf).collect(Collectors.toList());
        String query = "INSERT INTO user (userName, password, phone, statusId, roleId) " +
                "VALUES ('" + String.join("', '", values) + "')";
        user.setId(createEntity(query));
        return user;
    }

    public void deleteUser(int id) {

    }


}
