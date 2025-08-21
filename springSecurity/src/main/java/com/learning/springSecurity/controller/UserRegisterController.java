package com.learning.springSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springSecurity.model.Users;
import com.learning.springSecurity.service.UserService;

@RestController
public class UserRegisterController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public Users registerUser(@RequestBody Users user) {
		
		return userService.saveUser(user);
		
	}
	
}
