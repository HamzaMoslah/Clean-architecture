package com.clean.sample.domain.entity;

public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Integer age;
    private String phone;

    private User() {
    }

    public User build(){
        User user = new User();
        user.age = this.age;
        user.firstName = this.firstName;
        user.lastName = this.lastName;
        user.password = this.password;
        user.phone = this.phone;
        user.username = this.username;
        return user;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;

        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
