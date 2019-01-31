package com.carfix.mvp.sender;

import com.carfix.mvp.model.web.GeoLocationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GeoLocationSender {

    private static final String COUNTRY = "Germany";
    private static final String API_KEY = "&key=AIzaSyBttiDLyRGz9gQ-FB3-DGBBhhNHaW_E8KU";
    private static final String ROUTE = "https://maps.googleapis.com/maps/api/geocode/json?address=";

    @Autowired
    private RestTemplate restTemplate;

    public GeoLocationResponse getAddressByPlz(Integer plz) {
        String url = ROUTE + plz + '+' + COUNTRY + API_KEY;
        return restTemplate.getForEntity(url, GeoLocationResponse.class).getBody();
    }
}
