package com.codegym.model;

public class Product {
    private int id  ;
    private String name_product;
    private String description;
    private double price;

    public Product() {
    }

    public Product(int id, String name_product, String description, double price) {
        this.id = id;
        this.name_product = name_product;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
