package com.lti.springdemo.demo1basic;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	
	@Value("Mhapsa")
	private String city;
	@Value("Gao")
	private String state;
		
	public Address() {
		super();
	}
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
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
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	

}
