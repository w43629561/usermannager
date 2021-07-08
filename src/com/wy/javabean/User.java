package com.wy.javabean;


public class User {
    private int uid;
    private String username;
    private String password;
    private String name;
    private String telephone;
    private String birthday;

    public User(int uid, String username, String password, String name, String telephone, String birthday) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.name = name;
        this.telephone = telephone;
        this.birthday = birthday;
    }

    public User() {
        // TODO Auto-generated constructor stub
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
