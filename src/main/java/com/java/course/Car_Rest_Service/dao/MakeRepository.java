package com.java.course.Car_Rest_Service.dao;

import com.java.course.Car_Rest_Service.entity.Make;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MakeRepository extends JpaRepository<Make, Integer> {
}
