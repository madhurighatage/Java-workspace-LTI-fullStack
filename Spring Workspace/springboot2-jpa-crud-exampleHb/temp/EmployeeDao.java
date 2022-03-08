package com.meenal.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meenal.entity.Employee;


@Repository  // spring uses code generation libs   to create impln of the doa interface 
public interface EmployeeDao
{ 
	public List<Employee> getEmpList();
	public List<Integer> getEmpIds();
	
	
	public Employee getEmpDetails(int id); 	 
	public Employee addNewEmployee(Employee emp) ; 
	public int updateEmployee(Employee emp) ; // 
		
}



