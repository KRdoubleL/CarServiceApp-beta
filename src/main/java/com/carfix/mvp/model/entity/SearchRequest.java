package com.carfix.mvp.model.entity;

import com.carfix.mvp.model.base.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "SEARCH_REQUEST")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequest extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "CAR_ID")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "ADDRESS_PLZ")
    private Address address;

    @Column(name = "SERVICES", nullable = false)
    private String services;
}
