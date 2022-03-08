package com.lti.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/hello")
	public void sayHello() {
		System.out.println("Hello.....");
	}
}
