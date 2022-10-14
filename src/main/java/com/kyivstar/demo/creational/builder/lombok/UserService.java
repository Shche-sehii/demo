package com.kyivstar.demo.creational.builder.lombok;

public class UserService {

    public User createDefaultUser() {

        return User.builder()
                .login("login")
                .firstName("firstName")
                .lastName("lastName")
                .email("some-email@email.com")
                .build();
    }
}
