package com.java.course.Car_Rest_Service.dao;

import com.java.course.Car_Rest_Service.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {
}
