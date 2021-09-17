package by.itstep.cafe.controller.impl;

import by.itstep.cafe.controller.ProductController;
import by.itstep.cafe.entity.Product;
import by.itstep.cafe.service.ProductService;
import by.itstep.cafe.service.ServiceFactory;

public class ProductControllerImpl implements ProductController {

    private ProductService productService;

    public ProductControllerImpl() {

        this.productService = ServiceFactory.getInstance().getProductService();
    }

    public void createProduct(Product product) {
        productService.createProduct(product);
    }

    public void deleteProduct(int id) {

    }
}
