package com.velocity.onlineShopping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.onlineShopping.model.UserRegistration;

@Repository
public interface UserRegistrationRepository extends CrudRepository<UserRegistration, Integer>{

}
