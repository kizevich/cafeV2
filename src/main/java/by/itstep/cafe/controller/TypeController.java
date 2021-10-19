package by.itstep.cafe.controller;

import by.itstep.cafe.dao.entity.Type;

import java.util.List;

public interface TypeController {

    void addType(Type type);

    void removeType(int id);

    void updateType(Type type);

    List listTypes();

    Type getType(String name);
}
