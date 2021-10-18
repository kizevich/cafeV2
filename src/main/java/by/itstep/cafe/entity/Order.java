package by.itstep.cafe.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "price")
    private int fullPrice;
    @OneToMany(mappedBy = "product")
    private List<Product> products;
    @ManyToOne
    @JoinColumn(name = "clientId")
    private User client;
    @Column(name = "state")
    private String state;
    @Column(name = "createDate")
    private String createDate;
    @ManyToOne
    @JoinColumn(name = "formedBy")
    private User formedBy;
    @ManyToOne
    @JoinColumn(name = "driverId")
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
