package com.fakezindev.webservicesspringboot.repositories;

import com.fakezindev.webservicesspringboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
