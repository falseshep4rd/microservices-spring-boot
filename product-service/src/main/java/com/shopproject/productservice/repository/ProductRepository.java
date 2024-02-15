package com.shopproject.productservice.repository;

import com.shopproject.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepository extends MongoRepository<Product, String> {
}
