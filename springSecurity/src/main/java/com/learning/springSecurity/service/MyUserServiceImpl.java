package com.learning.springSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.learning.springSecurity.model.UserPrincipal;
import com.learning.springSecurity.model.Users;
import com.learning.springSecurity.repo.UserRepo;

@Service
public class MyUserServiceImpl implements UserDetailsService {

	
	@Autowired
	private UserRepo userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userRepo.findByUsername(username);
		if(user==null) {
		   System.out.println("User Not Found Or Bad Credentials");
		   throw new UsernameNotFoundException("User Not Found Or Bad Credentials");
		}
		return new UserPrincipal(user);
	}

}
