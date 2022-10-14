package com.kyivstar.demo.creational.builder.simple;

public class UserService {

    public User createDefaultUser() {

        return new User("FirstName", "LastName", "Login", null, "active", null, "some-email@email.com");
    }
}
