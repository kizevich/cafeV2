package by.itstep.cafe.service.impl;

import by.itstep.cafe.dao.DaoFactory;
import by.itstep.cafe.dao.TypeDao;
import by.itstep.cafe.entity.Type;
import by.itstep.cafe.service.TypeService;

public class TypeServiceImpl implements TypeService {

    private TypeDao typeDao;

    public TypeServiceImpl() {
        this.typeDao = DaoFactory.getInstance().getTypeDao();
    }

    @Override
    public void createType(Type type) {
        typeDao.createType(type);
    }
}
