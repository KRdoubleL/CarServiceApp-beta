package com.carfix.mvp.services.impl;

import com.carfix.mvp.exception.exceptions.ResourceNotFoundException;
import com.carfix.mvp.model.entity.User;
import com.carfix.mvp.repository.UserRepository;
import com.carfix.mvp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(Long telNumber, String email) {
        User user = new User();
        user.setTelNumber(telNumber);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }

    @Override
    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new ResourceNotFoundException("User was not found");
        }
    }

    @Override
    public User getUser(Long telNumber, String email) {
        Optional<User> user = Optional.ofNullable(userRepository.findByTelNumber(telNumber));
        return user.orElseGet(() -> createUser(telNumber, email));
    }
}
