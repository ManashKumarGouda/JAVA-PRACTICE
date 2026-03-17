package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Address address = (Address) context.getBean("address");
        System.out.println("Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getState() + " " + address.getZipCode());
    }

    @Override
    public String toString() {
        return "App []";
    }
}