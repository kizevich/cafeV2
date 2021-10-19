package by.itstep.cafe.controller.impl;

import by.itstep.cafe.controller.StatusController;
import by.itstep.cafe.dao.entity.Status;
import by.itstep.cafe.service.StatusService;

import java.util.List;

public class StatusControllerImpl implements StatusController {

    private StatusService statusService;

    public StatusControllerImpl() {
        this.statusService = ServiceFactory.getInstance().getStatusService();
    }

    @Override
    public void addStatus(Status status) {
        statusService.addStatus(status);
    }

    @Override
    public void removeStatus(int id) {
        statusService.removeStatus(id);
    }

    @Override
    public void updateStatus(Status status) {
        statusService.updateStatus(status);
    }

    @Override
    public List listStatuses() {
        return statusService.listStatuses();
    }

    @Override
    public Status getStatus(String name) {
        return statusService.getStatus(name);
    }
}
