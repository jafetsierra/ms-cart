package com.mintic.carrito_ms.controllers;
import com.mintic.carrito_ms.exceptions.CategoryNotFoundException;
import com.mintic.carrito_ms.models.Product;
import com.mintic.carrito_ms.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {
    private final ProductRepository productRepository;
    public  ProductController(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    @PostMapping("/product")
    Product newProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
    @GetMapping("/product/{category}")
    List<Product> productCategory(@PathVariable String category){
        if (productRepository.findByCategory(category) == null) {
            throw new CategoryNotFoundException("No se encontro esa categoría: " + category);
        }
        return productRepository.findByCategory(category);

    }
}
