package com.carfix.mvp.services;

import com.carfix.mvp.model.entity.Car;

public interface CarService {

    Car getCarById(Long id);

    Car getCarByTSNAndHSN(String tsn, String hsn);
}
