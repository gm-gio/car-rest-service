package com.java.course.Car_Rest_Service.service.impl;

import com.java.course.Car_Rest_Service.dao.MakeRepository;
import com.java.course.Car_Rest_Service.service.MakeService;
import org.springframework.stereotype.Service;

@Service
public class MakeServiceImpl implements MakeService {
    private final MakeRepository makeRepository;

    public MakeServiceImpl(MakeRepository makeRepository) {
        this.makeRepository = makeRepository;
    }
}
