package by.itstep.cafe.controller.impl;

import by.itstep.cafe.controller.StatusController;
import by.itstep.cafe.entity.Status;
import by.itstep.cafe.service.ServiceFactory;
import by.itstep.cafe.service.StatusService;

public class StatusControllerImpl implements StatusController {

    private StatusService statusService;

    public StatusControllerImpl(StatusService statusService) {
        this.statusService = ServiceFactory.getInstance().getStatusService();
    }

    @Override
    public void createStatus(Status status) {
        statusService.createStatus(status);
    }
}
