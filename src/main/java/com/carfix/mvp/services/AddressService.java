package com.carfix.mvp.services;

import com.carfix.mvp.model.entity.Address;

public interface AddressService {

    Address createAddress(Integer plz);

    Address getAddressByPlz(Integer plz);
}