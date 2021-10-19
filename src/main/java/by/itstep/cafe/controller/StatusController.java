package by.itstep.cafe.controller;

import by.itstep.cafe.dao.entity.Status;

import java.util.List;

public interface StatusController {

    void addStatus(Status status);

    void removeStatus(int id);

    void updateStatus(Status status);

    List listStatuses();

    Status getStatus(String name);
}
