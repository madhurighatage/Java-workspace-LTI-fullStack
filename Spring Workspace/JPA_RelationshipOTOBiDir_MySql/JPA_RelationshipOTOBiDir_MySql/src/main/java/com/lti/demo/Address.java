package com.lti.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESSOTO")
public class Address {
	
	@Id
	@Column(name="Address_Id")
	private Long addressId;
	
	@Column(name="CITY")
	private String city ;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="COUNTRY")
	private String country;
	
	//not required 
	//@JoinColumn(name="EMP_ID")
	@OneToOne(mappedBy="address")
	private Employee employee;
	
		
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Address(Long addressId, String city, String state, String country) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public Address() {
		super();
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address \n [addressId=" + addressId + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	

}
