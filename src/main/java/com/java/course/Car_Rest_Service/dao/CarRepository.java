package com.java.course.Car_Rest_Service.dao;

import com.java.course.Car_Rest_Service.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
