package by.itstep.cafe.controller.impl;

import by.itstep.cafe.controller.TypeController;
import by.itstep.cafe.dao.entity.Type;
import by.itstep.cafe.service.TypeService;

import java.util.List;

public class TypeControllerImpl implements TypeController {

    private TypeService typeService;

    public TypeControllerImpl() {
        this.typeService = ServiceFactory.getInstance().getTypeService();
    }

    @Override
    public void addType(Type type) {
        typeService.addType(type);
    }

    @Override
    public void removeType(int id) {
        typeService.removeType(id);
    }

    @Override
    public void updateType(Type type) {
        typeService.updateType(type);
    }

    @Override
    public List listTypes() {
        return typeService.listTypes();
    }

    @Override
    public Type getType(String name) {
        return typeService.getType(name);
    }
}
