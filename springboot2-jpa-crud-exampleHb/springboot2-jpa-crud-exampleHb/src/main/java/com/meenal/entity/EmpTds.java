package com.meenal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmpTds")
public class EmpTds {
	
	int tranId;
	String empName;	
	int panNo;
	int month;
	int year;
	Long tdsAmount;
	String emailId;

	
		public EmpTds( String empName, int panNo, int month, int year, Long tdsAmount, String emailId) {
		super();
	
		this.empName = empName;
		this.panNo = panNo;
		this.month = month;
		this.year = year;
		this.tdsAmount = tdsAmount;
		this.emailId = emailId;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getTranId() {
		return tranId;
	}
	public void setTranId(int tranId) {
		this.tranId = tranId;
	}

	 
    @Column(name = "Emp_Name", nullable = false)
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Column(name = "Pan_No", nullable = false)
	public int getPanNo() {
		return panNo;
	}
	public void setPanNo(int panNo) {
		this.panNo = panNo;
	}
	@Column(name = "Month", nullable = false)
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	@Column(name = "Year", nullable = false)
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Column(name = "Tds_Amount", nullable = false)
	public Long getTdsAmount() {
		return tdsAmount;
	}
	public void setTdsAmount(Long tdsAmount) {
		this.tdsAmount = tdsAmount;
	}
	@Column(name = "Email_Id", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "EmpTds [tranId=" + tranId + ", empName=" + empName + ", panNo=" + panNo + ", month=" + month + ", year="
				+ year + ", tdsAmount=" + tdsAmount + ", emailId=" + emailId + "]";
	}
	
	
	
	
	
	

}
/*

create table Emp_Tds
(
   tran_id number(10) not null,
   Emp_Name Varchar2(30) not null, 
   Pan_No number(10) not null,
   Month number(2) not null, 
   Year number(4) not null, 
   Tds_Amount number(10) not null,
   Email_Id varchar2(30) not null,
   primary key(tran_id)
);*/

