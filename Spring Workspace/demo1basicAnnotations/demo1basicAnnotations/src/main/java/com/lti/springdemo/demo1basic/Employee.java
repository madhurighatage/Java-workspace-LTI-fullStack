package com.lti.springdemo.demo1basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee {

	@Value("Manohar parikar")
	private String empName;
	
	@Autowired  // byType
	@Qualifier("address")
	private Address address; // ref of other class

	
	
	public Employee(String empName, Address address) {
		super();
		this.empName = empName;
		this.address = address;
	}


	public Employee() {
		super();
	}


	public String getEmpName() {
		return empName;
	}
	
	  
	public void setEmpName(String empName) { this.empName = empName; }
	 

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + "]";
	}

}
