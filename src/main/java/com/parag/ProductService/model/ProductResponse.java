package com.parag.ProductService.model;

public class ProductResponse {
    private String productName;
    private long productId;
    private long price;
    private long quantity;

    public ProductResponse() {
    }

    public ProductResponse(String productName, long productId, long price, long quantity) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
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
