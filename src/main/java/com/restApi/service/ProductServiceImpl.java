package com.restApi.service;

import com.restApi.Entity.Product;
import com.restApi.Repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> searchProducts(String query) {

        List<Product> products=productRepository.searchProducts(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {

        return productRepository.save(product);
    }
}





