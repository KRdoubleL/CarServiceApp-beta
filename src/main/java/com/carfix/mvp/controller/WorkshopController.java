package com.carfix.mvp.controller;

import com.carfix.mvp.exception.exceptions.InputValidationException;
import com.carfix.mvp.model.web.WorkshopWeb;
import com.carfix.mvp.services.WorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class WorkshopController {

    @Autowired
    WorkshopService workshopService;

    @PostMapping("/workshop/create")
    public void createWorkshop(@RequestBody @Valid WorkshopWeb workshopWeb, BindingResult result) {
        if (result.hasErrors()) {
            throw new InputValidationException(result);
        }
        workshopService.createWorkshop(workshopWeb);
    }
}
