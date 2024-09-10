package com.java.course.Car_Rest_Service.service.impl;

import com.java.course.Car_Rest_Service.dao.CategoryRepository;
import com.java.course.Car_Rest_Service.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
