package com.carfix.mvp.services.impl;

import com.carfix.mvp.exception.exceptions.ResourceNotFoundException;
import com.carfix.mvp.model.entity.Address;
import com.carfix.mvp.model.web.Coordinates;
import com.carfix.mvp.model.web.GeoLocationResponse;
import com.carfix.mvp.sender.GeoLocationSender;
import com.carfix.mvp.services.GeoLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeoLocationServiceImpl implements GeoLocationService {

    private static final String POSTAL_CODE_TYPE = "postal_code";

    @Autowired
    GeoLocationSender geoLocationSender;

    public Address getAddressByPlz(Integer plz) {
        Address address = new Address();
        address.setPlz(plz);

        GeoLocationResponse response = geoLocationSender.getAddressByPlz(plz);
        List<String> responseTypes = response.getTypes();
        if (!responseTypes.contains(POSTAL_CODE_TYPE)) {
            throw new ResourceNotFoundException("PLZ wasn't found");
        }

        Coordinates location = response.getLocation();

        address.setLat(location.getLat());
        address.setLon(location.getLng());

        return address;
    }
}
