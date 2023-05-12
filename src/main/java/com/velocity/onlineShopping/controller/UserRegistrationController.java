package com.velocity.onlineShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.onlineShopping.model.UserRegistration;
import com.velocity.onlineShopping.service.UserRegistrationService;

@RestController
public class UserRegistrationController {

	@Autowired
	private UserRegistrationService userRegistrationService;
	
	@PostMapping("/saveUser")
	public ResponseEntity<UserRegistration> saveUser(@RequestBody UserRegistration userRegistration) {
		
		UserRegistration registration =  userRegistrationService.saveUser(userRegistration);
		return ResponseEntity.ok().body(registration);
		
	}
}
