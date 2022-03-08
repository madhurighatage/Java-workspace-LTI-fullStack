package com.medical.Medical_Store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="medicine")
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "medid")
	private long medId;
	
	@Column(name = "storeid")
	private int storeId;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "mg")
	private int mg;
	
	public Medicine() {
		super();
	}
	public Medicine(int storeId, int quantity, String name, int price, int mg) {
		super();
		this.storeId = storeId;
		this.quantity = quantity;
		this.name = name;
		this.price = price;
		this.mg = mg;
	}
	public long getMedId() {
		return medId;
	}
	public void setMedId(long medId) {
		this.medId = medId;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMg() {
		return mg;
	}
	public void setMg(int mg) {
		this.mg = mg;
	}
}
