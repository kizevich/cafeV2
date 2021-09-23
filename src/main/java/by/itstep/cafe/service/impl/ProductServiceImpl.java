package by.itstep.cafe.service.impl;

import by.itstep.cafe.dao.DaoFactory;
import by.itstep.cafe.dao.ProductDao;
import by.itstep.cafe.entity.Product;
import by.itstep.cafe.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    public ProductServiceImpl () {
        this.productDao = DaoFactory.getInstance().getProductDao();
    }


    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public void removeProduct(int id) {
        productDao.removeProduct(id);
    }

    @Override
    public void updateProduct(Product product) {
        productDao.updateProduct(product);
    }

    @Override
    public List<Product> listProducts() {
        return productDao.listProducts();
    }

    @Override
    public Product getProduct(String name) {
        return productDao.getProduct(name);
    }
}
