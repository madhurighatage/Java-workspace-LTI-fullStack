package com.lti.appl.services;

import java.util.List;

import com.lti.appl.beans.Employee;


public interface EmpServices {
	
	public List<Employee> getEmpList() ;
	public int addEmp(Employee e);
	public int updateEmp(int empNo,double sal); 
	public Employee getByEmpId(int empNo);

}
