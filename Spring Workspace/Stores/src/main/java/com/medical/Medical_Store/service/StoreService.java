package com.medical.Medical_Store.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.medical.Medical_Store.model.Store;
import com.store.util.BaseResponse;

public interface StoreService  {

	Store updateStor(int storeId, Store store);
	
	ResponseEntity<BaseResponse<Store>> save(Store store);
		
	Store getBygstNo(Long gstNo);
	
	public ResponseEntity<Store> getBystoreId(int storeId);
	
	//public ResponseEntity<BaseResponse<Store>> getBystoreId(int storeId);
	
	ResponseEntity<Map<String,Boolean>> deleteStore(int storeId);
	
	public ResponseEntity<BaseResponse<Store>> getAll();
	
	public List<Store> getAllStores();
	
}