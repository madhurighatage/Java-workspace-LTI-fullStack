package com.lti.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.beans.Employee;
import com.lti.appl.dao.EmpDao;
import com.lti.appl.dao.EmpDaoImpl;



//Service //waiter 
@Service("empService")
public class EmpServicesImpl implements EmpServices{

	@Autowired
	private EmpDao empDao;
	
	
	public EmpServicesImpl()
	{
		empDao= new EmpDaoImpl();
	}
	
	@Override
	public List<Employee> getEmpList() {
System.out.println(" inside service EmpServiceImpl");
		
		return empDao.getEmpList();
	}
	@Override
	public int addEmp(Employee e) {
		return empDao.addEmp(e);
	}
	@Override
	public int updateEmp(int empNo, double sal) {
		return empDao.updateEmp(empNo,sal);
	}

	@Override
	public Employee getByEmpId(int empNo) {
		
		return empDao.getByEmpId(empNo);
	}

}
