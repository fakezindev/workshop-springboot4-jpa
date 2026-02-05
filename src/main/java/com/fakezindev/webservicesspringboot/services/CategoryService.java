package com.fakezindev.webservicesspringboot.services;

import com.fakezindev.webservicesspringboot.entities.Category;
import com.fakezindev.webservicesspringboot.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository CategoryRepository;

    public CategoryService(CategoryRepository CategoryRepository) {
        this.CategoryRepository = CategoryRepository;
    }

    public List<Category> findAll() {
        return CategoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = CategoryRepository.findById(id);
        return obj.get();
    }
}
