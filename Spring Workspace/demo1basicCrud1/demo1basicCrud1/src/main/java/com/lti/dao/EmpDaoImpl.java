package com.lti.dao;

import java.util.ArrayList;
import java.util.List;
import com.lti.dao.*;

import com.lti.entity.Employee;

public class EmpDaoImpl implements EmpDao{

	static List<Employee> empList= new ArrayList();

	public List<Employee> getEmpList() {

		System.out.println(" indise EmpDaoImpl ");
		
		Employee e1= new Employee(101,"Jay",50000);
		Employee e2= new Employee(102,"Vijay",60000);
		Employee e3 =new Employee(103,"Sanay",70000);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		return empList;
	}

	public int addEmp(Employee e) {
		  empList.add(e);
	       
	       return e.getEmpNo();
	}

	public int updateEmp(int empNo, double sal) {
		for(Employee e:empList) {
			int no=e.getEmpNo();

			if(no==empNo) {
			e.setEmpSal(89898);
			}
			System.out.println(e);
			}
			return empNo;
	}
	

}
