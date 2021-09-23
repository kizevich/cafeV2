package by.itstep.cafe.service;

import by.itstep.cafe.entity.Status;

import java.util.List;

public interface StatusService {

    void addStatus(Status status);

    void removeStatus(int id);

    void updateStatus(Status status);

    List listStatuses();

    Status getStatus(String name);
}
