package com.meenal.services;

import java.util.List;

import com.meenal.entity.Employee;

public interface EmployeeService {

	public List<Employee> getEmpList();

	public Employee getEmpDetails(int id);

	public Employee addNewEmployee(Employee emp);

	public int updateEmployee(Employee emp);

	public String deleteEmployeeById(int empid);

	public List<Integer> getEmpIds();

	

}
