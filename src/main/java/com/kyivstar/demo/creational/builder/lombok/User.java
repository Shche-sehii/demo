package com.kyivstar.demo.creational.builder.lombok;

import lombok.Builder;

@Builder
public class User {

    private final String firstName;
    private final String lastName;
    private final String login;
    private final String address;
    private final String status;
    private final String contactNumber;
    private final String email;
}
