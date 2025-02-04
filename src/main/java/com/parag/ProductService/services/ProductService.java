package com.parag.ProductService.services;

import com.parag.ProductService.model.ProductRequest;
import com.parag.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long id);
}
