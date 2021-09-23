package by.itstep.cafe.entity;

public class User {

    private int id;
    private String userName;
    private String phone;
    private String password;
    private Status status;
    private Role role;

    public User() {
    }

    public User(String userName, String password, String phone, Status status, Role role) {
        this.userName = userName;
        this.phone = phone;
        this.password = password;
        this.status = status;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return userName + "\n" + password + "\n" + phone + "\n" + status + "\n" + role;
    }
}
