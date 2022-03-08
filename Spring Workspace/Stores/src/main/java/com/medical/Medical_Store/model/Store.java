package com.medical.Medical_Store.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name="Store")
public class Store {
//	storeId,storeName,gstNo,address,isActive,createDate,updatedDate
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int storeId;
	private String storeName;
	
	private Long gstNo;
	
	private String city;
	private String indiast;
	private int zipcode;
	private int isActive;
	
	@CreationTimestamp
    private LocalDateTime createDateTime;
 
    @UpdateTimestamp
    private LocalDateTime updateDateTime;
    
	public Store() {
		super();
	}
	
	public Store(String storeName, String city, String state, int zipcode) {
		super();
		this.storeName = storeName;
		this.city = city;
		this.indiast = state;
		this.zipcode = zipcode;
	}

	public Store(String storeName, long gstNo, String city, String indiast, int zipcode) {
		super();
		this.storeName = storeName;
		this.gstNo = gstNo;
		this.city = city;
		this.indiast = indiast;
		this.zipcode = zipcode;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public Long getgstNo() {
		return gstNo;
	}
	public void setgstNo(Long gstNo) {
		this.gstNo = gstNo;
	}
	
	public String getIndiast() {
		return indiast;
	}

	public void setIndiast(String indiast) {
		this.indiast = indiast;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	


	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "\n\n [\n storeId=" + storeId + ", storeName=" + storeName + ", gstNo=" + gstNo + ", city=" + city
				+ ", indiast=" + indiast + ", zipcode=" + zipcode + ", isActive=" + isActive + ", createDateTime="
				+ createDateTime + ", updateDateTime=" + updateDateTime + "]";
	}
	
	
}
