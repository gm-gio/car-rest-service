package com.java.course.Car_Rest_Service.dao;

import com.java.course.Car_Rest_Service.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
