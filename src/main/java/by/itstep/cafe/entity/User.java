package by.itstep.cafe.entity;

public class User {

    private int id;
    private String userName;
    private String phone;
    private String password;
    private int statusId;
    private int roleId;

    public User() {
    }

    public User(String userName, String password, String phone, int statusId, int roleId) {
        this.userName = userName;
        this.phone = phone;
        this.password = password;
        this.statusId = statusId;
        this.roleId = roleId;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public int getStatusId() {
        return statusId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setId(int Id) { this.id = id; }

    @Override
    public String toString() {
        return userName + "\n" + password + "\n" + phone + "\n" + statusId + "\n" + roleId;
    }
}
