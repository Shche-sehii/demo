package com.kyivstar.demo.creational.builder.lombok;

import lombok.Builder;

@Builder
public class User {

    private String firstName;
    private String lastName;
    private String login;
    private String address;
    private String status;
    private String contactNumber;
    private String email;
}
