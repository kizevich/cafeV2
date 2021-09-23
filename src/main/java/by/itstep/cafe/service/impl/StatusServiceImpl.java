package by.itstep.cafe.service.impl;

import by.itstep.cafe.dao.DaoFactory;
import by.itstep.cafe.dao.StatusDao;
import by.itstep.cafe.entity.Status;
import by.itstep.cafe.service.StatusService;

import java.util.List;

public class StatusServiceImpl implements StatusService {

    private StatusDao statusDao;

    public StatusServiceImpl() {

        this.statusDao = DaoFactory.getInstance().geStatusDao();
    }

    @Override
    public void addStatus(Status status) {
        statusDao.addStatus(status);
    }

    @Override
    public void removeStatus(int id) {
        statusDao.removeStatus(id);
    }

    @Override
    public void updateStatus(Status status) {
        statusDao.updateStatus(status);
    }

    @Override
    public List listStatuses() {
        return statusDao.listStatuses();
    }

    @Override
    public Status getStatus(String name) {
        return statusDao.getStatus(name);
    }
}
