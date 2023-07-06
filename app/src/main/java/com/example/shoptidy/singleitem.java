package com.example.shoptidy;

public class singleitem {

    private String name;
    private int quantity;
    private double price;

    public singleitem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }




}
