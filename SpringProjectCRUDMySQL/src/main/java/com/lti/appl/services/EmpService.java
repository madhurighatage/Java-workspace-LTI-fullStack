package com.lti.appl.services;

import java.util.List;

import com.lti.appl.beans.Employee;
import com.lti.appl.exceptions.CustomEmpException;

public interface EmpService {
	
	public abstract int addEmployee(Employee e);
	public abstract List<Employee> listAllEmployees();
	public abstract Employee getEmpById( int empNo);
	public abstract double updateSalary(int empNo, double sal)throws CustomEmpException;
}
