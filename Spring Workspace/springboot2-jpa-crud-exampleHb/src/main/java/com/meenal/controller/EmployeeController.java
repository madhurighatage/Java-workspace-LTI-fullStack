package com.meenal.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meenal.entity.EmpTds;
import com.meenal.entity.Employee;
import com.meenal.repository.EmpJpaDaoRepository;
import com.meenal.services.EmployeeJpaRepService;
import com.meenal.userexception.ResourceNotFoundException;


@CrossOrigin(origins = "*") // any url, any, port no, any server
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeJpaRepService empJpaRepService;
	
	
	//http://localhost:8080/api/v1/employees
	@GetMapping("/employees" )
	public List<Employee> getAllEmployees() {
		System.out.println("inside controller");	
		return empJpaRepService.getEmpList();
	}	
	
	//http://localhost:8090/api/v1/employees/102
	@GetMapping("/employees/{id}")
	public Employee getEmpDetails(@PathVariable(value = "id") int id) {
		return empJpaRepService.getEmpDetails(id);
	}
	
	//http://localhost:8090/api/v1/emplids
	@GetMapping("/emplids")
	public List<Integer> getEmpIds() {
		System.out.println("inside controller");
			return empJpaRepService.getEmpIds();
	}
	
	
		
	//http://localhost:8090/api/v1/addnewemp
	/*@PostMapping("/addnewemp")
	public Employee createEmployee(@Valid @RequestBody Employee employee) {
		return employeeService.addNewEmployee(employee);
	}
	 */
	
	//http://localhost:8090/api/v1/updateEmployee
	/*@PutMapping(path = "/updateEmployee")
	public int updateEmployee(@RequestBody Employee emp)
	{
		int eid=employeeService.updateEmployee(emp);
		return eid;	 
	}	 
		*/	

	
	/*@GetMapping("/finance")
	public int calcMonthlySal() {

		int count = employeeService.calcMonthlySal();
		System.out.println(count + "records updated ");
		return count;
	}*/

	
	
	
	/*
	 * @PutMapping("/employees/{id}") public ResponseEntity<Employee>
	 * updateEmployee(@PathVariable(value = "id") Long employeeId,
	 * 
	 * @Valid @RequestBody Employee employeeDetails) throws
	 * ResourceNotFoundException { Employee employee =
	 * employeeRepository.findById(employeeId) .orElseThrow(() -> new
	 * ResourceNotFoundException("Employee not found for this id :: " +
	 * employeeId));
	 * 
	 * employee.setEmailId(employeeDetails.getEmailId());
	 * employee.setLastName(employeeDetails.getLastName());
	 * employee.setFirstName(employeeDetails.getFirstName()); final Employee
	 * updatedEmployee = employeeRepository.save(employee); return
	 * ResponseEntity.ok(updatedEmployee); }
	 */

	/*@DeleteMapping("/employees/{id}") // public Map<String, Boolean> public
	public ResponseEntity<String> deleteEmployee(@PathVariable(value = "id") int employeeId)
			throws ResourceNotFoundException {
		Employee employee = employeeService.getEmpDetails(employeeId);
		employeeService.deleteEmployeeById(employeeId);
		return ResponseEntity.ok("deleted record of :" + employeeId);
	}*/


	
	/*	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) throws ResourceNotFoundException
	{
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		return ResponseEntity.ok().body(employee);
	}*/
	
}