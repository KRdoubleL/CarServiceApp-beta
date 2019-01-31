package com.carfix.mvp.services.impl;

import com.carfix.mvp.model.entity.Workshop;
import com.carfix.mvp.model.web.WorkshopWeb;
import com.carfix.mvp.repository.WorkshopRepository;
import com.carfix.mvp.services.AddressService;
import com.carfix.mvp.services.WorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkshopServiceImpl implements WorkshopService {

    @Autowired
    WorkshopRepository workshopRepository;

    @Autowired
    AddressService addressService;

    @Override
    public void createWorkshop(WorkshopWeb workshopWeb) {
        Workshop workshop = new Workshop();
        workshop.setEmail(workshopWeb.getEmail());
        workshop.setTelNumber(workshopWeb.getTelNumber());
        workshop.setPassword(workshopWeb.getPassword());
        workshop.setAddress(addressService.getAddressByPlz(workshopWeb.getPlz()));
        workshop.setServices(workshopWeb.getServices());
        workshopRepository.save(workshop);
    }
}
