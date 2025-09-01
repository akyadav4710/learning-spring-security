package com.learning.springSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.learning.springSecurity.model.Users;
import com.learning.springSecurity.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;

	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public Users saveUser(Users user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return userRepo.save(user);
	}
	
	
}
