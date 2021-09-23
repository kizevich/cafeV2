package by.itstep.cafe.dao;

import by.itstep.cafe.entity.Product;
import java.util.List;

public interface ProductDao {

    void addProduct(Product product);

    void removeProduct(int id);

    void updateProduct(Product product);

    List<Product> listProducts();

    Product getProduct(String name);
}
