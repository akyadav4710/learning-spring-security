package com.learning.springSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
  
	
		@GetMapping("/")
		public String greet(HttpServletRequest Request) {
			return "Hello there!! I am learning Spring Security" + Request.getSession().getId();
		}
}
