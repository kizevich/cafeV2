package by.itstep.cafe.entity;

import java.util.List;

public class Order {

    private int id;
    private int fullPrice;
    private List<Product> products;
    private int clientId;
    private String state;
    private String createDate;
    private int formedById;
    private int driverId;

    public Order(int id, List<Product> products, int clientId, String createDate,
                 int formedById, int driverId) {
        this.id = id;
        this.products = products;
        this.clientId = clientId;
        this.createDate = createDate;
        this.formedById = formedById;
        this.driverId = driverId;
        for (Product product: products) {
            fullPrice += product.getPrice();
        }
    }

    public int getClientId() {
        return clientId;
    }

    public String getState() {
        return state;
    }

    public String getCreateDate() {
        return createDate;
    }

    public int getFormedById() {
        return formedById;
    }

    public int getDriverId() {
        return driverId;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
