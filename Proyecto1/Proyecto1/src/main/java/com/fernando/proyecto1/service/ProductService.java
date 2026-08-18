package com.fernando.proyecto1.service;

import com.fernando.proyecto1.entity.ProductEntity;
import com.fernando.proyecto1.repository.ProductRepository;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    //Me permite hacer filtrado con multiples condiciones relacionadas a precio minimo, maximo, y nombre.
    public List<ProductEntity> getAllProducts(Double minPrice, Double maxPrice, String name){

        return productRepository.findAll().stream()
                .filter(p -> minPrice == null || p.getPrice() >= minPrice)
                .filter(p -> maxPrice == null || p.getPrice() <= maxPrice)
                .filter(p -> name == null || p.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }

    public ProductEntity createProduct(ProductEntity product){

        if(productRepository.existsByNameIgnoreCase(product.getName())){
            throw new RuntimeException("Ya existe un producto con ese nombre");
        }

        return productRepository.save(product);
    }

}
