package com.fakezindev.webservicesspringboot.repositories;

import com.fakezindev.webservicesspringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
