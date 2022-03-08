package com.lti.employeeproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmpController {		
	
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)	
	public Employee getEmployee() 
	{
		System.out.println("Inside firstPage");
		Employee emp = new Employee();
		emp.setName("Jay");
		emp.setDesignation("manager");
		emp.setEmpId("101");
		emp.setSalary(3000);

		return emp;
	}
	

}
