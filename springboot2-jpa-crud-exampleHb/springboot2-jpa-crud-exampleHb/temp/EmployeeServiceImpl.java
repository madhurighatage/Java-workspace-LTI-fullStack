package com.meenal.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.Entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.meenal.entity.EmpTds;
import com.meenal.entity.Employee;
import com.meenal.repository.EmpJpaDaoRepository;
import com.meenal.repository.EmployeeDao;



@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
		
	
	@Override
	public List<Employee> getEmpList() {
		System.out.println("inside Services");
		List<Employee> empList = dao.getEmpList();
		//List<Integer> ids=(List<Integer>) empList.get(1);
		//	List<Integer> ids = empList.stream().map(Entity -> Entity.getId()).collect(Collectors.toList());
		//System.out.println(ids);		
		return empList;
	}


	@Override
	public Employee getEmpDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employee addNewEmployee(Employee emp) {
		// TODO Auto-generated method stub
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


	@Override
	public List<Integer> getEmpIds() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	}
	
