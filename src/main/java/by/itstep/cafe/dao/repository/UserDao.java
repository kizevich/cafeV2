package by.itstep.cafe.dao.repository;

import by.itstep.cafe.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

    User findUserByUserName(String name);

}
