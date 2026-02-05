package com.fakezindev.webservicesspringboot.services;

import com.fakezindev.webservicesspringboot.entities.Product;
import com.fakezindev.webservicesspringboot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository ProductRepository;

    public ProductService(ProductRepository ProductRepository) {
        this.ProductRepository = ProductRepository;
    }

    public List<Product> findAll() {
        return ProductRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = ProductRepository.findById(id);
        return obj.get();
    }
}
