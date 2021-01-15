package com.example.demo.model;

public class User {
    private String id;
    private String name;
    private int age;
    private UserStatus userStatus;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public User(String id, String name, int age, UserStatus userStatus) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.userStatus = userStatus;
    }
}
