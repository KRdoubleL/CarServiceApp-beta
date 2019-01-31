package com.carfix.mvp.services.impl;

import com.carfix.mvp.model.entity.Address;
import com.carfix.mvp.repository.AddressRepository;
import com.carfix.mvp.services.AddressService;
import com.carfix.mvp.services.GeoLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    GeoLocationService geoLocationService;

    @Override
    public Address createAddress(Integer plz) {
       Address address = geoLocationService.getAddressByPlz(plz);
       addressRepository.save(address);
       return address;
    }

    @Override
    public Address getAddressByPlz(Integer plz) {
        Optional<Address> address = Optional.ofNullable(addressRepository.getAddressByPlz(plz));
        return address.orElseGet(() -> createAddress(plz));
    }
}
