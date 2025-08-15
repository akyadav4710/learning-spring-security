package com.learning.springSecurity.controller;

import org.springframework.web.bind.annotation.RestController;

import com.learning.springSecurity.model.Student;

@RestController
public class StudentContoller {

	public void dummyStudent() {
		Student s1 = new Student(1,"Vishal","K. V. 39 GTC");
	}
	
}
