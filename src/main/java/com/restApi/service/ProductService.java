package com.restApi.service;

import com.restApi.Entity.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}

