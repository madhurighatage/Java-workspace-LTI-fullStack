package com.lti.appl.user;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.appl.beans.Employee;
import com.lti.appl.exceptions.CustomEmpException;
import com.lti.appl.services.EmpService;
import com.lti.appl.services.EmpServiceImpl;

public class ClientApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
		
		EmpService service =context.getBean("empService",EmpServiceImpl.class);
		
		
		
		//List<Employee> empList=service.listAllEmployees();
		//System.out.println(" List Back to client " +  empList);			
		

		//Employee e= service.getEmpById(101); 
		//System.out.println(e);
		
	/*	double sal;
		try {
			sal = service.updateSalary(102,5000);
			
			System.out.println("your salary updated " + sal );
			
		} catch (CustomEmpException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(" pg m continue");
	*/
		
		Employee e=new Employee(110,"pathu",80000);		
		int empNo=service.addEmployee(e);
		System.out.println(" you are registered with id :" + empNo);
		
		
	}

}
