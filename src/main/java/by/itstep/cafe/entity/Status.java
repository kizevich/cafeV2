package by.itstep.cafe.entity;

public class Status {

    private String name;
    private int id;
    private int discount;

    public Status() {
    }

    public Status(String name, int discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
