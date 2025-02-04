package com.parag.ProductService.model;

import lombok.Data;

//@Data
public class ProductRequest {
    private String name;
    private long price;
    private long quantity;

    public ProductRequest(String name, long price, long quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public ProductRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
