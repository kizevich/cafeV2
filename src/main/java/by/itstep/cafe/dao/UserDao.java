package by.itstep.cafe.dao;

import by.itstep.cafe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {

    User findUserByUserName(String name);

}
