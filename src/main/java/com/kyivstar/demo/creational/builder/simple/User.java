package com.kyivstar.demo.creational.builder.simple;

public class User {

    private String firstName;
    private String lastName;
    private String login;
    private String address;
    private String status;
    private String contactNumber;
    private String email;

    public User(String firstName, String lastName, String login, String address,
            String status, String contactNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.address = address;
        this.status = status;
        this.contactNumber = contactNumber;
        this.email = email;
    }
}
