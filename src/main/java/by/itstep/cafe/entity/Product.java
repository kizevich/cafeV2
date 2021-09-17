package by.itstep.cafe.entity;

public class Product {

    private int id;
    private String name;
    private int price;
    private int typeId;
    private String description;

    public Product(int id, String name, int price, int typeId, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.typeId = typeId;
        this.description = description;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getTypeId() {
        return typeId;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) { this.id = id; }

    public void setPrice(int price) {
        this.price = price;
    }
}
