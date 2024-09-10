package com.java.course.Car_Rest_Service.service.impl;

import com.java.course.Car_Rest_Service.dao.ModelRepository;
import com.java.course.Car_Rest_Service.service.ModelService;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService {
    private final ModelRepository modelRepository;

    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }
}
