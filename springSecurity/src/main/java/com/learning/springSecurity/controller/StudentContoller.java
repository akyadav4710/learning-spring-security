package com.learning.springSecurity.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springSecurity.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentContoller {

	private List<Student> listOfStudents = new ArrayList<>(
			List.of(new Student(1, "Vishal", "K. V. 39 GTC"), new Student(2, "Subodh", "Army Public School")));

	@GetMapping("/students")
	public List<Student> getStudentsList(){
		return listOfStudents;
	}
	
	
	@GetMapping("/getCSRFtoken")
	public CsrfToken getCSRFtoken(HttpServletRequest Request) {
		return (CsrfToken) Request.getAttribute("_csrf");
	}
	
	@PostMapping("/addStudent")
	public List<Student> addStudent(@RequestBody Student student) {
		listOfStudents.add(student);
		return listOfStudents;
	}
	
}
