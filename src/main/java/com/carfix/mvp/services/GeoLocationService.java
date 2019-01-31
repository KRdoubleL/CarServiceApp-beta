package com.carfix.mvp.services;

import com.carfix.mvp.model.entity.Address;

public interface GeoLocationService {

    Address getAddressByPlz (Integer plz);
}
