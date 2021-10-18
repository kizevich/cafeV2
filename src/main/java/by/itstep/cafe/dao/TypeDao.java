package by.itstep.cafe.dao;

import by.itstep.cafe.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypeDao extends JpaRepository<Type, Integer> {

    void addType(Type type);

    void removeType(int id);

    void updateType(Type type);

    List listTypes();

    Type getType(String name);
}
