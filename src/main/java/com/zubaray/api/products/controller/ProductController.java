package com.zubaray.api.products.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zubaray.api.products.model.Product;
import com.zubaray.api.products.repository.ProductRepository;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductRepository repository;

    @GetMapping("/findAll")
    public List<Product> findAll() {
        logger.info("Get all products...");
        List<Product> products = new ArrayList<>();
        repository.findAll().forEach(products::add);
        return products;
    }

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        logger.info("Creating a new products...");
        logger.info("{}", product);
        return repository.save(product);
    }
}
