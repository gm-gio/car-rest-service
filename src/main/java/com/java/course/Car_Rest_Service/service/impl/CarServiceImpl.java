package com.java.course.Car_Rest_Service.service.impl;

import com.java.course.Car_Rest_Service.dao.CarRepository;
import com.java.course.Car_Rest_Service.service.CarService;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}
