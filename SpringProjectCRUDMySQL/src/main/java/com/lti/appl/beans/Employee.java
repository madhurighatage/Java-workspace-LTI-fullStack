package com.lti.appl.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="EMP_SPRING")
public class Employee {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)	
	//@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	//@GenericGenerator(name = "native",strategy = "native")
	@Column(name="EMP_NO")
	private int empNo;
	
	
	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name="EMP_SAL")
	private double empSal;
	
	
	public Employee(String empName, double empSal) {
		super();
		this.empName = empName;
		this.empSal = empSal;
	}
	
	
	public Employee(int empNo, String empName, double empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
	}
	public Employee() {
		super();
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
