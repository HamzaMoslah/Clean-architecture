package com.clean.sample.controller.model;

import com.clean.sample.domain.entity.User;

public class UserWeb {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Integer age;
    private String id;
    private String phone;
    private String email;

    public static class UserBuilder {
        private String username;
        private String password;
        private String firstName;
        private String lastName;
        private Integer age;
        private String id;
        private String phone;
        private String email;

        public UserBuilder(String username, String password, String firstName, String lastName, Integer age, String id, String phone, String email) {
            this.username = username;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.id = id;
            this.phone = phone;
            this.email = email;
        }

        public UserBuilder() {
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build(){
            return new User(id, username, password, firstName, lastName, phone, age, email);
        }
    }

    public UserWeb() {
    }

    public UserWeb(String id, String username, String password, String firstName, String lastName, String phone, Integer age, String email) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
    }

    public User toUser() {
        return new User.UserBuilder()
                .setLastName(lastName)
                .setFirstName(firstName)
                .setPhone(phone)
                .setUsername(username)
                .setAge(age)
                .setPassword(password)
                .setEmail(email)
                .build();
    }

    public static UserWeb toUserWeb(User user) {
        var userWeb = new UserWeb();
        userWeb.setId(user.getId());
        userWeb.setEmail(user.getEmail());
        // do not map password
        userWeb.setAge(user.getAge());
        userWeb.setPhone(user.getPhone());
        userWeb.setUsername(user.getUsername());
        userWeb.setLastName(user.getLastName());
        userWeb.setFirstName(user.getFirstName());
        return userWeb;
    }

    public String getEmail() {
        return email;
    }

    public UserWeb setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserWeb setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserWeb setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserWeb setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserWeb setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public UserWeb setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getId() {
        return id;
    }

    public UserWeb setId(String id) {
        this.id = id;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserWeb setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
