package com.learning.springSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Authentication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springSecurity.model.Users;
import com.learning.springSecurity.service.MyUserServiceImpl;
import com.learning.springSecurity.service.UserService;

@RestController
public class UserRegisterController {
	
	@Autowired
	private UserService userService;
	
	@Autowired 
	private MyUserServiceImpl serviceImpl;
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/register")
	public Users registerUser(@RequestBody Users user) {
		
		return userService.saveUser(user);
		
	}
	
	@PostMapping("/login")
	public Users loginUser(@RequestBody Users user) {
		
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
			UserDetails userDetail = serviceImpl.loadUserByUsername(user.getUsername());
			jwtUtil.generateToken(userDetail.getUsername());
		} catch (Exception e) {
			
		}
		
	}
	
}
