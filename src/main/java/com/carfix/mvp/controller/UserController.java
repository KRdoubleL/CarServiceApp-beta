package com.carfix.mvp.controller;

import com.carfix.mvp.exception.exceptions.InputValidationException;
import com.carfix.mvp.model.web.UserWeb;
import com.carfix.mvp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user/create")
    public void createUser(@RequestBody @Valid UserWeb userWeb, BindingResult result) {
        if (result.hasErrors()) {
            throw new InputValidationException(result);
        }
        userService.createUser(userWeb.getTelNumber(), userWeb.getEmail());
    }
}
