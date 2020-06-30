package com.main.app.entity;

import java.util.Date;

public class Customer {
    private String name;
    private String age;
    private Date Dob;
    private String idNumber;
    private Address address;

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Customer setAge(String age) {
        this.age = age;
        return this;
    }

    public Date getDob() {
        return Dob;
    }

    public Customer setDob(Date dob) {
        Dob = dob;
        return this;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public Customer setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Customer setAddress(Address address) {
        this.address = address;
        return this;
    }



}
