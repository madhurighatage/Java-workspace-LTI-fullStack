package com.lti.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.beans.Employee;
import com.lti.appl.dao.EmpJpaDaoRepository;

@Service
public class EmployeeJpaRepService implements EmpServices {
	
	//EmpDao empDao  EmpDapImpl - manual @ em.persist em.remvoe 
	
	@Autowired
	private EmpJpaDaoRepository daoJpaRep;

	@Override
	public List<Employee> listAllEmployees() {
		System.out.println("JPA - get all employees");
		List<Employee> empList=daoJpaRep.findAll();
		return empList;
	}

	
	
	
	/**
	 * 
	 */
	@Override
	public List<Employee> getEmpList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addEmp(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmp(int empNo, Employee sal) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee getByEmpId(int empNo) {
		// TODO Auto-generated method stub
		return null;
	}	

}