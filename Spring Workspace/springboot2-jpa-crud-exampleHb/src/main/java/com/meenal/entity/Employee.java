package com.meenal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String emailId;
    private Long annPack;
    private int pan;
    
	public Employee() {
  
    }
 
    public Employee(String firstName, String lastName, String emailId,Long annPack, int pan) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.emailId = emailId;
         this.annPack=annPack;
         this.pan=pan;
    }
 
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="EMP_GEN")
	@SequenceGenerator(name="EMP_GEN",	sequenceName="emp_seq",allocationSize=1)
        public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
 
    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    @Column(name = "email_address", nullable = false)
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    @Column(name = "pan_no", nullable = false)
    public int getPan() {
		return pan;
	}

	public void setPan(int pan) {
		this.pan = pan;
	}

	 @Column(name = "ann_pack", nullable = false)
	public Long getAnnPack() {
		return annPack;
	}

	public void setAnnPack(Long annPack) {
		this.annPack = annPack;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", annPack=" + annPack + ", pan=" + pan + "]";
	}

	 
 
}

/* 
 * oracl 10g - SYSTEM Ritwik123
 */
/*
create table employees
(
   id number(10) not null,
   first_name Varchar2(30) not null, 
   last_name Varchar2(30) not null,
   email_address varchar2(30) not null,
   ann_pack number(10,2) not null,
   pan_no number(10) not null,
   primary key(id)
);


insert into employees values(101,'Jay','Joshi','Jay@gmail.com',10000,111);
insert into employees values(102,'Vijay','Vora','Vijay@gmail.com',20000,222);
insert into employees values(103,'Sanjay','Sakpal','Sanjay@gmail.com',30000,333);

*/