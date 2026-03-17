package com.example;


public class Customer {
    private int id;

    private String name;
    private String city;

    public Customer() {}

    public Customer(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;  
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) { 
        this.city = city;
    }
}