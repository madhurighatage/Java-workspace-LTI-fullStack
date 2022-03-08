package com.lti.appl.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.appl.beans.Employee;
import com.lti.appl.services.EmpServices;

public class UserApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		EmpServices service = (EmpServices) context.getBean("empService");
		List<Employee> userList = new ArrayList<Employee>();
		userList = service.getEmpList();
		System.out.println(userList);

		Employee e = service.getByEmpId(103);
		int i = service.updateEmp(103, 90004);
		System.out.println(i + " Updated");
		/*
		 * Employee emp = new Employee(106, "Vishal", 85000); int empno =
		 * service.addEmp(emp);
		 * 
		 * System.out.println(empno + " Added ");
		 */

		Employee emp1 = new Employee("Raj", 75098);
		int empno = service.addEmp(emp1);

		System.out.println(emp1 + " Added ");

	}

}
