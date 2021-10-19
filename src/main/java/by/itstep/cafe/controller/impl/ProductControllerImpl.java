package by.itstep.cafe.controller.impl;

import by.itstep.cafe.controller.ProductController;
import by.itstep.cafe.dao.entity.Product;
import by.itstep.cafe.service.ProductService;

import java.util.List;

public class ProductControllerImpl implements ProductController {

    private ProductService productService;

    public ProductControllerImpl() {

        this.productService = ServiceFactory.getInstance().getProductService();
    }


    @Override
    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    @Override
    public void removeProduct(int id) {
        productService.removeProduct(id);
    }

    @Override
    public void updateProduct(Product product) {
        productService.updateProduct(product);
    }

    @Override
    public List<Product> listProducts() {
        return productService.listProducts();
    }

    @Override
    public Product getProduct(String name) {
        return productService.getProduct(name);
    }
}
