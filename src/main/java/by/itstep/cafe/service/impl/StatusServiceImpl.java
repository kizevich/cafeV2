package by.itstep.cafe.service.impl;

import by.itstep.cafe.dao.DaoFactory;
import by.itstep.cafe.dao.StatusDao;
import by.itstep.cafe.entity.Status;
import by.itstep.cafe.service.StatusService;

public class StatusServiceImpl implements StatusService {

    private StatusDao statusDao;

    public StatusServiceImpl() {

        this.statusDao = DaoFactory.getInstance().geStatusDao();
    }

    @Override
    public void createStatus(Status status) {

        statusDao.createStatus(status);
    }
}
