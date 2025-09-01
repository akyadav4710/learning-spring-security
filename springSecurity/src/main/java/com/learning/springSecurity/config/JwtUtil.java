package com.learning.springSecurity.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

	public String generateToken(String username) {
		Map<String,Object> claims=new HashMap<>();
		return createToken(claims,username);
	}

	private String createToken(Map<String, Object> claims, String username) {
		
		return null;
	}
	
}
