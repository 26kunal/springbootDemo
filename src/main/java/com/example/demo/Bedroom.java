package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Bedroom {
    public Bedroom() {
        System.out.println("Bedroom Created");
    }

    private  String name;
    private int bid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void chair(){
        System.out.println("Two chairs");
    }
}
