package com.carfix.mvp.controller;

import com.carfix.mvp.exception.exceptions.InputValidationException;
import com.carfix.mvp.model.entity.SearchRequest;
import com.carfix.mvp.model.entity.Workshop;
import com.carfix.mvp.model.web.SearchRequestWeb;
import com.carfix.mvp.services.SearchRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class SearchRequestController {

    @Autowired
    SearchRequestService searchRequestService;

    @GetMapping("/search/{userId}")
    public List<SearchRequest> getSearchRequestListByUserId(@PathVariable(value = "userId") Long userId) {
        return searchRequestService.getSearchRequestListByUserId(userId);
    }

    @PostMapping("/search/create")
    public List<Workshop> createSearchRequest(@RequestBody @Valid SearchRequestWeb searchRequestWeb, BindingResult result) {
        if (result.hasErrors()) {
            throw new InputValidationException(result);
        }
        return searchRequestService.createSearchRequest(searchRequestWeb);
    }
}
