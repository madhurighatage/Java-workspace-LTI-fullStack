package com.lti.entity;

public class Employee {

	private int empNo;
	private String empName;
	private double empSal;
	
	
	public Employee() {
		super();
	}


	public Employee(int empNo, String empName, double empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
	}


	public int getEmpNo() {
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}


	@Override
	public String toString() {
		return "\n Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
}
