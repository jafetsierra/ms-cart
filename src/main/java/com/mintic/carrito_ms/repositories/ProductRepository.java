package com.mintic.carrito_ms.repositories;

import com.mintic.carrito_ms.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
public interface ProductRepository extends MongoRepository <Product, String> {
    List<Product> findByCategory (String category);
}