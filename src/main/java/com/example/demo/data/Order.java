package com.example.demo.data;

import lombok.Data;

@Data
public class Order {
    public Order(){}
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
