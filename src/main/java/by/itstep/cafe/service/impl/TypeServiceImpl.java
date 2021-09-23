package by.itstep.cafe.service.impl;

import by.itstep.cafe.dao.DaoFactory;
import by.itstep.cafe.dao.TypeDao;
import by.itstep.cafe.entity.Type;
import by.itstep.cafe.service.TypeService;

import java.util.List;

public class TypeServiceImpl implements TypeService {

    private TypeDao typeDao;

    public TypeServiceImpl() {
        this.typeDao = DaoFactory.getInstance().getTypeDao();
    }

    @Override
    public void addType(Type type) {
        typeDao.addType(type);
    }

    @Override
    public void removeType(int id) {
        typeDao.removeType(id);
    }

    @Override
    public void updateType(Type type) {
        typeDao.updateType(type);
    }

    @Override
    public List listTypes() {
        return typeDao.listTypes();
    }

    @Override
    public Type getType(String name) {
        return typeDao.getType(name);
    }
}
