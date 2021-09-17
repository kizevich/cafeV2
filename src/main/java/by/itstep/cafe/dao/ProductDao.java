package by.itstep.cafe.dao;

import by.itstep.cafe.entity.Product;

public interface ProductDao {

    Product createProduct(Product product);

    void deleteProduct(int id);
}
