package com.lti.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.beans.Employee;
import com.lti.appl.dao.EmpDao;
import com.lti.appl.exceptions.CustomEmpException;


@Service("empService")
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDao dao;
	
	public EmpDao getDao() {
		return dao;
	}

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Employee> listAllEmployees() {
		
		System.out.println("service layer ");
		
		List<Employee> empList=dao.listAllEmployees();
		
		return empList;
	}


	@Override
	public int addEmployee(Employee e) {
		System.out.println("service layer");	
		int empNo=dao.addEmployee(e);		
		return empNo;
	}

	@Override
	public Employee getEmpById(int empNo) {
	System.out.println("service ");
	Employee e=dao.getEmpById(empNo);
	return e;
	}

	@Override
	public double updateSalary(int empNo, double sal) throws CustomEmpException{
		
		return dao.updateSalary(empNo, sal);
	}

	
}
