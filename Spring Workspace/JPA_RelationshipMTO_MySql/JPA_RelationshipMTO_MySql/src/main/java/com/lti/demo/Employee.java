package com.lti.demo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sun.nio.cs.Surrogate.Generator;

//EMPMTO  EMPID	EMPNAME	SALARY	DEPTID

@Entity
@Table(name="EMPMTO")
public class Employee {
	
	@Id
	@Column(name="EMPID")	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	
	@Column(name="EMPNAME")	
	private String empName;
	
	@Column(name="SALARY")	
	private double salary ;

	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="DEPTID")
	private Department department;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double salary, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	
	
	

}
