package by.itstep.cafe.service;

import by.itstep.cafe.entity.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);

    void removeProduct(int id);

    void updateProduct(Product product);

    List<Product> listProducts();

    Product getProduct(String name);
}
