package com.carfix.mvp.repository;

import com.carfix.mvp.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByTelNumber(Long telNumber);
}
