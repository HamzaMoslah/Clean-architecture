package com.clean.sample.manalapp;

import com.clean.sample.config.ManualConfig;
import com.clean.sample.domain.entity.User;

public class Main {
    public static void main(String[] args) {
        // Setup
        var config = new ManualConfig();
        var createUser = config.createUser();
        var findUser = config.findUser();
        var loginUser = config.loginUser();
        var user = new User.UserBuilder()
                .setLastName("Moslah")
                .setFirstName("Hamza")
                .setPhone("+21655968850")
                .setUsername("hmoslah")
                .setAge(27)
                .setPassword("Hamza123-")
                .setEmail("hamzamaslah@gmail.com")
                .build();

        // Create a user
        var actualCreateUser = createUser.createUser(user);
        System.out.println("User created with id " + actualCreateUser.getId());

        // Find a user by id
        var actualFindUser = findUser.findById(actualCreateUser.getId());
        System.out.println("Found user with id " + actualFindUser.get().getId());

        // List all users
        var users = findUser.findAllUsers();
        System.out.println("List all users: " + users);

        // Login
        loginUser.login("hamzamaslah@gmail.com", "Hamza123-");
        System.out.println("Allowed to login with email 'hamzamaslah@gmail.com' and password  'Hamza123-'");
    }
}
