package com.parag.ProductService.services;

import com.parag.ProductService.entity.Product;
import com.parag.ProductService.exceptions.ProductServiceCustomException;
import com.parag.ProductService.model.ProductRequest;
import com.parag.ProductService.model.ProductResponse;
import com.parag.ProductService.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// The below section is for logging using Logger, for me Lombok is not working.
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public long addProduct(ProductRequest productRequest) {
        final Logger log = LogManager.getLogger(ProductServiceImpl.class);
        log.info("Adding product");
//        Product product = Product.builder()
//                .productName(productRequest.getName())
//                .price(productRequest.getPrice())
//                .quantity(productRequest.getQuantity())
//                .build();
        Product product = new Product
                (productRequest.getName(),
                        productRequest.getPrice(),
                        productRequest.getQuantity());
        productRepository.save(product);
        log.info("Product created");
        return product.getProductId();
    }

    @Override
    public ProductResponse getProductById(long id) {
        final Logger log = LogManager.getLogger(ProductServiceImpl.class);
        log.info("Get the product for product id {}", id);
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductServiceCustomException("Product not found.", "PRODUCT_NOT_FOUND"));
        ProductResponse productResponse = new ProductResponse(product.getProductName(),
                product.getProductId(), product.getPrice(), product.getQuantity());
        return productResponse;
    }
}
