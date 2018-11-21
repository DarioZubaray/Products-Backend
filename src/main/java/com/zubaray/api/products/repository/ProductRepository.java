package com.zubaray.api.products.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zubaray.api.products.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
