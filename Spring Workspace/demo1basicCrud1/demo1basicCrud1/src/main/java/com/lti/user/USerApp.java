package com.lti.user;

import java.util.ArrayList;
import java.util.List;
import com.lti.entity.Employee;
import com.lti.services.EmpServices;
import com.lti.services.EmpServicesImpl;

public class USerApp {
	
	public static void main(String[] args) {	
		
		List<Employee> userList= new ArrayList();
		
		EmpServices service= new EmpServicesImpl();
		userList=service.getEmpList();
		System.out.println(" User gets list "+ userList);	
		
		
		Employee emp = new Employee(105,"Ajay",60000);   // 70000
		int rec=service.addEmp(emp);  
		System.out.println(rec + "added");		
		service.updateEmp(105,890898);		
		
		System.out.println(" User gets list "+ userList);	
	}
}
