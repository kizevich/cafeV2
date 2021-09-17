package by.itstep.cafe.service.impl;

import by.itstep.cafe.dao.DaoFactory;
import by.itstep.cafe.dao.ProductDao;
import by.itstep.cafe.entity.Product;
import by.itstep.cafe.service.ProductService;

public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    public ProductServiceImpl () {
        this.productDao = DaoFactory.getInstance().getProductDao();
    }

    public void createProduct(Product product) {

    }

    public void deleteProduct(int id) {

    }
}
