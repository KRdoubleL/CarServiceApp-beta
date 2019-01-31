package com.carfix.mvp.services.impl;

import com.carfix.mvp.exception.exceptions.ResourceNotFoundException;
import com.carfix.mvp.model.entity.Car;
import com.carfix.mvp.repository.CarRepository;
import com.carfix.mvp.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public Car getCarById(Long id) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isPresent()) {
            return car.get();
        } else {
            throw new ResourceNotFoundException("Car was not found");
        }
    }

    @Override
    public Car getCarByTSNAndHSN(String tsn, String hsn) {
        Optional<Car> car = Optional.ofNullable(carRepository.getCarByTSNAndHSN(tsn, hsn));
        if (car.isPresent()) {
            return car.get();
        } else {
            throw new ResourceNotFoundException("Car was not found");
        }
    }
}
