package by.itstep.cafe.dao.impl;

import by.itstep.cafe.dao.ProductDao;
import by.itstep.cafe.entity.Product;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static by.itstep.cafe.dao.impl.ConnectionDao.createEntity;

public class ProductDaoImpl implements ProductDao {

    @Override
    public Product createProduct(Product product) {
        List<String> values = Stream.of(product.getName(), product.getPrice(), product.getDescription(),
                product.getTypeId()).
                map(String::valueOf).collect(Collectors.toList());
        String query = "INSERT INTO user (name, price, description, typeId) " +
                "VALUES ('" + String.join("', '", values) + "')";
        product.setId(createEntity(query));
        return product;
    }

    public void deleteProduct(int id) {

    }
}
