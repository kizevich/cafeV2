package by.itstep.cafe.entity;

import java.util.List;

public class Order {

    private int id;
    private int fullPrice;
    private List<Product> products;
    private User client;
    private String state;
    private String createDate;
    private User formedBy;
    private User driver;

    public Order(int id, List<Product> products, User client, String createDate,
                 User formedBy, User driver) {
        this.id = id;
        this.products = products;
        this.client = client;
        this.createDate = createDate;
        this.formedBy = formedBy;
        this.driver = driver;
        for (Product product : products) {
            fullPrice += product.getPrice();
        }
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public User getFormedBy() {
        return formedBy;
    }

    public void setFormedBy(User formedBy) {
        this.formedBy = formedBy;
    }

    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }
}
