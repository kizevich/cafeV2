package by.itstep.cafe.service;

import by.itstep.cafe.entity.Type;

import java.util.List;

public interface TypeService {

    void addType(Type type);

    void removeType(int id);

    void updateType(Type type);

    List listTypes();

    Type getType(String name);
}
