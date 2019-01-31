package com.carfix.mvp.services;

import com.carfix.mvp.model.entity.User;

public interface UserService {

    User createUser(Long telNumber, String email);

    User getUser(Long id);

    User getUser(Long telNumber, String email);
}
