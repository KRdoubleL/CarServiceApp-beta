package com.carfix.mvp.services;

import com.carfix.mvp.model.entity.SearchRequest;
import com.carfix.mvp.model.entity.Workshop;
import com.carfix.mvp.model.web.SearchRequestWeb;

import java.util.List;

public interface SearchRequestService {

    List<Workshop> createSearchRequest(SearchRequestWeb searchRequestWeb);

    List<SearchRequest> getSearchRequestListByUserId(Long userId);
}
