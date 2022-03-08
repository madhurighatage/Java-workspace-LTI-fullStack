package com.lti.appl.dao;

import java.util.List;
import com.lti.appl.beans.*;


public interface EmpDao {
	
	public List<Employee> getEmpList();
	
	public int addEmp(Employee e);
	
	public int updateEmp(int empNo,double sal); 
	
	public Employee getByEmpId(int empNo);

}
