package by.itstep.cafe.controller;

import by.itstep.cafe.entity.Product;

public interface ProductController {

    void createProduct(Product product);

    void deleteProduct(int id);
}
