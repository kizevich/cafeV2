package by.itstep.cafe.controller.impl;

import by.itstep.cafe.controller.TypeController;
import by.itstep.cafe.entity.Type;
import by.itstep.cafe.service.ServiceFactory;
import by.itstep.cafe.service.TypeService;

public class TypeControllerImpl implements TypeController {

    private TypeService typeService;

    public TypeControllerImpl() {
        this.typeService = ServiceFactory.getInstance().getTypeService();
    }

    @Override
    public void createType(Type type) {
        typeService.createType(type);
    }
}
