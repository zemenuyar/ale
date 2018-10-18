package com.company;

public class Grocery27 {
    private String itemname;
    private double price;
    private int quantity;
    private double cost;


    public Grocery27() {
    }


    public Grocery27(String itemname, double price, int quantity, double cost) {
        this.itemname = itemname;
        this.price = price;
        this.quantity = quantity;
        this.cost = cost;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
