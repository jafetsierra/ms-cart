package com.mintic.carrito_ms.controllers;
import com.mintic.carrito_ms.exceptions.UserNotFoundException;
import com.mintic.carrito_ms.models.Cart;
import com.mintic.carrito_ms.repositories.CartRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CartController {
    private final CartRepository CartRepository;
    public  CartController(CartRepository CartRepository){
        this.CartRepository=CartRepository;
    }
    @PostMapping("/cart")
    Cart newCart(@RequestBody Cart Cart){
        return CartRepository.save(Cart);
    }
    @GetMapping("/cart/{userId}")
    List<Cart> useCart(@PathVariable String userId){
        return CartRepository.findByUserId(userId);
    }

}
