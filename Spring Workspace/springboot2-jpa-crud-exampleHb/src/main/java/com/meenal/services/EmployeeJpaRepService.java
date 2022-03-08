package com.meenal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meenal.entity.Employee;
import com.meenal.repository.EmpJpaDaoRepository;

@Service
public class EmployeeJpaRepService implements EmployeeService {
	
	//EmpDao empDao  EmpDapImpl - manual @ em.persist em.remvoe 
	
	@Autowired
	private EmpJpaDaoRepository daoJpaRep;

	@Override
	public List<Employee> getEmpList() {
		System.out.println("inside Services");
		List<Employee> empList=daoJpaRep.findAll();
		return empList;
	}

	@Override
	public Employee getEmpDetails(int id) {
	Optional<Employee> optEmp=daoJpaRep.findById(id);  // em.find(Employee.class,101);
	Employee e= optEmp.get();
		return e;
	}
	
	@Override
	public List<Integer> getEmpIds() {
		return null;
	}

	@Override
	public Employee addNewEmployee(Employee emp) {
		daoJpaRep.save(emp);   
		return null;
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String deleteEmployeeById(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}

/* Why Optional ?
very Java Programmer is familiar with NullPointerException. 
It can crash your code. And it is very hard to avoid it without using too many null checks.
Java 8 has introduced a new class Optional in java.util package.
 It can help in writing a neat code without using too many null checks. 
 By using Optional, we can specify alternate values to return or alternate code to run. 
 This makes the code more readable because the facts which were hidden are now visible to the developer.
*/