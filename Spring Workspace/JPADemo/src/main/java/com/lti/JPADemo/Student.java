package com.lti.JPADemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud")
public class Student {
	@Id
	private int stuId;
	private String stuName;
	private double score;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stuId, String stuName, double score) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", score=" + score + "]";
	}
	
	

}
