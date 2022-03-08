package com.lti.services;

import java.util.List;

import com.lti.dao.EmpDao;
import com.lti.dao.EmpDaoImpl;
import com.lti.entity.Employee;

//Service //waiter 

public class EmpServicesImpl implements EmpServices{

	
	private EmpDao empDao;
	
	public EmpServicesImpl()
	{
		empDao= new EmpDaoImpl();
	}
	
	public List<Employee> getEmpList() {
System.out.println(" inside service EmpServiceImpl");
		
		return empDao.getEmpList();
	}

	public int addEmp(Employee e) {
		return empDao.addEmp(e);
	}

	public int updateEmp(int empNo, double sal) {
		return empDao.updateEmp(105,890898);
	}

}
