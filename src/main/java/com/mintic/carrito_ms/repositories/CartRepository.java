package com.mintic.carrito_ms.repositories;

import com.mintic.carrito_ms.models.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface CartRepository extends MongoRepository<Cart, String> {
    List<Cart> findByUserId (String userId);
}


