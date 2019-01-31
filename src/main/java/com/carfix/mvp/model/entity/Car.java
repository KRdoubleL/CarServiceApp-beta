package com.carfix.mvp.model.entity;

import com.carfix.mvp.model.base.AbstractBaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CAR")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car extends AbstractBaseEntity {

    @Column(name = "TSN", length = 3)
    private String tsn;

    @Column(name = "HSN", length = 4)
    private String hsn;

    @Column(name = "VIN", length = 17, unique = true)
    private String vin;
}
