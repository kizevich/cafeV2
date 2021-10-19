package by.itstep.cafe.controller;

import by.itstep.cafe.dao.entity.Product;

import java.util.List;

public interface ProductController {

    void addProduct(Product product);

    void removeProduct(int id);

    void updateProduct(Product product);

    List<Product> listProducts();

    Product getProduct(String name);
}
