package by.itstep.cafe.dao;

import by.itstep.cafe.entity.Status;

import java.util.List;

public interface StatusDao {

    void addStatus(Status status);

    void removeStatus(int id);

    void updateStatus(Status status);

    List listStatuses();

    Status getStatus(String name);
}
