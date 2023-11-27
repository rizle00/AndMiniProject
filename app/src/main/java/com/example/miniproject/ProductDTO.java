package com.example.miniproject;

import java.util.ArrayList;

public class ProductDTO {
    private String name, info;
    private int price;
    private int quantity;
    private int choice;

    public ProductDTO(String name, String info, int price, int quantity) {
        this.name = name;
        this.info = info;
        this.price = price;
        this.quantity = quantity;
    }

    public ProductDTO() {
    }

    public ProductDTO(String name, int price, int choice) {
        this.name = name;
        this.price = price;
        this.choice = choice;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
