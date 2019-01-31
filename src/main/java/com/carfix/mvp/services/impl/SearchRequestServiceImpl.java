package com.carfix.mvp.services.impl;

import com.carfix.mvp.model.entity.SearchRequest;
import com.carfix.mvp.model.entity.Workshop;
import com.carfix.mvp.model.web.SearchRequestWeb;
import com.carfix.mvp.repository.SearchRequestRepository;
import com.carfix.mvp.repository.WorkshopRepository;
import com.carfix.mvp.services.AddressService;
import com.carfix.mvp.services.CarService;
import com.carfix.mvp.services.SearchRequestService;
import com.carfix.mvp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchRequestServiceImpl implements SearchRequestService {

    @Autowired
    SearchRequestRepository searchRequestRepository;

    @Autowired
    CarService carService;

    @Autowired
    UserService userService;

    @Autowired
    AddressService addressService;

    @Autowired
    WorkshopRepository workshopRepository;

    @Override
    public List<Workshop> createSearchRequest(SearchRequestWeb searchRequestWeb) {
        SearchRequest searchRequest = new SearchRequest();
        searchRequest.setUser(userService.getUser(searchRequestWeb.getUser().getTelNumber(), searchRequestWeb.getUser().getEmail()));
        searchRequest.setCar(carService.getCarByTSNAndHSN(searchRequestWeb.getCar().getTsn(), searchRequestWeb.getCar().getHsn()));
        searchRequest.setAddress(addressService.getAddressByPlz(searchRequestWeb.getPlz()));
        searchRequest.setServices(searchRequestWeb.getServices());
        searchRequestRepository.save(searchRequest);

        return workshopRepository.findAllByPlz(searchRequestWeb.getPlz());
    }

    @Override
    public List<SearchRequest> getSearchRequestListByUserId(Long userId) {
        return searchRequestRepository.getSearchRequestListByUserId(userId);
    }
}
