package com.unitedcodernigar.cubecartautomation;

public class CustomerInfo1NClass {
    private String firstname;
    private String lastName;
    private String title;
    private String email;

    public CustomerInfo1NClass() {   // default
    }

    public CustomerInfo1NClass(String firstname, String lastName, String title, String email) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.title = title;
        this.email = email;
    }
    // if write firs alphabet uppercase "Email" Java give you just "Email = email;"

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }











}
