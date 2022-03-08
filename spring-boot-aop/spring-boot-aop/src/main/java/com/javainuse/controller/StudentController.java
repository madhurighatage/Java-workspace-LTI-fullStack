package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.service.StudentService;

@RestController

public class StudentController {

	@Autowired
	private StudentService stuService;
	
	@GetMapping("/student")
	public void helloStudent() {
		stuService.study("Java");
		stuService.study("EnvSci", 20);
	}
}
