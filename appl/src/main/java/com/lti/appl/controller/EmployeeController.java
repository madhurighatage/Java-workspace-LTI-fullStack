package com.lti.appl.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.appl.beans.Employee;
import com.lti.appl.services.EmpServices;
import com.lti.appl.services.EmpServicesImpl;
import com.lti.appl.services.EmployeeJpaRepService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/emp/")
public class EmployeeController {

	@Autowired
	private EmpServicesImpl empService;
	
	@Autowired
	private EmployeeJpaRepService jpaService;
	
	@GetMapping("/jpalistall")
	public List<Employee> listAllEmployee(){
		return jpaService.listAllEmployees();
	}
	

	@GetMapping("/listall")
	public List<Employee> getEmpList() {
		return empService.getEmpList();
	}

	@PostMapping("/addemp")
	public int addEmp(@RequestBody Employee e) {
		
		return empService.addEmp(e);
	}

	@GetMapping("/employee/{empNo}")
	public Employee getByEmpId(@PathVariable("empNo")int empNo) {
		return empService.getByEmpId(empNo);
	}
	
	@PutMapping("/update/{id}")
	public int updateEmp(@PathVariable("id")int empNo,@RequestBody Employee emp) {
		System.out.println(emp);
		return empService.updateEmp(empNo,emp);
	}

}
