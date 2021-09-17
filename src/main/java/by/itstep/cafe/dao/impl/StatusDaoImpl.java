package by.itstep.cafe.dao.impl;

import by.itstep.cafe.dao.StatusDao;
import by.itstep.cafe.entity.Status;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static by.itstep.cafe.dao.impl.ConnectionDao.createEntity;

public class StatusDaoImpl implements StatusDao {

    @Override
    public Status createStatus(Status status) {
        List<String> values = Stream.of(status.getName(), status.getDiscount()).
                map(String::valueOf).collect(Collectors.toList());
        String query = "INSERT INTO role (name, discount) " +
                "VALUES ('" + String.join("', '", values) + "')";
        status.setId(createEntity(query));
        return status;
    }
}
