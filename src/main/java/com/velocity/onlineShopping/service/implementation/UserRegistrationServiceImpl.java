package com.velocity.onlineShopping.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.onlineShopping.model.UserRegistration;
import com.velocity.onlineShopping.repository.UserRegistrationRepository;
import com.velocity.onlineShopping.service.UserRegistrationService;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{

	@Autowired
	private UserRegistrationRepository userRegistrationRepository;
	
	@Override
	public UserRegistration saveUser(UserRegistration userRegistration) {
		UserRegistration userRegistration2 = userRegistrationRepository.save(userRegistration);
		return userRegistration2;
	}

}
