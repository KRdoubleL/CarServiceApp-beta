package com.carfix.mvp.repository;

import com.carfix.mvp.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("SELECT c FROM Car c WHERE c.tsn = :tsn AND c.tsn = :tsn")
    Car getCarByTSNAndHSN(@Param("tsn") String tsn, @Param("tsn") String hsn);
}
