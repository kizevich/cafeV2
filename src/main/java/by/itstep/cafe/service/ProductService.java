package by.itstep.cafe.service;

import by.itstep.cafe.entity.Product;

public interface ProductService {

    void createProduct(Product product);

    void deleteProduct(int id);
}
