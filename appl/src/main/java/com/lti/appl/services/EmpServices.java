package com.lti.appl.services;

import java.util.List;

import com.lti.appl.beans.Employee;


public interface EmpServices {
	
	public List<Employee> getEmpList() ;
	public int addEmp(Employee e);
	public int updateEmp(int empNo,Employee sal); 
	public Employee getByEmpId(int empNo);
	public List<Employee> listAllEmployees();

}
