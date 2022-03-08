package com.medical.Medical_Store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medical.Medical_Store.model.Store;



@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {

	public Store findBygstNo(Long gstNo);	
	
	public Store findBystoreId(int storeId);

}