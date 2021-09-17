package by.itstep.cafe.dao.impl;

import by.itstep.cafe.dao.TypeDao;
import by.itstep.cafe.entity.Type;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static by.itstep.cafe.dao.impl.ConnectionDao.createEntity;

public class TypeDaoImpl implements TypeDao {

    @Override
    public Type createType(Type type) {
        List<String> values = Stream.of(type.getName()).
                map(String::valueOf).collect(Collectors.toList());
        String query = "INSERT INTO role (name) " +
                "VALUES ('" + String.join("', '", values) + "')";
        type.setId(createEntity(query));
        return type;
    }
}
