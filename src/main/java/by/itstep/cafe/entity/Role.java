package by.itstep.cafe.entity;

public class Role {

    private String name;
    private int id;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) { this.id = id; }
}
