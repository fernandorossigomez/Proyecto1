package com.fernando.proyecto1.controller;

import com.fernando.proyecto1.entity.ProductEntity;
import com.fernando.proyecto1.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    // GET all
    @GetMapping
    public List<ProductEntity> getAll(
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice,
            @RequestParam(required = false) String name
    ){
        return productService.getAllProducts(minPrice, maxPrice, name);
    }

    // POST
    @PostMapping
    public ProductEntity create(@RequestBody ProductEntity product){
        return productService.createProduct(product);
    }
}
