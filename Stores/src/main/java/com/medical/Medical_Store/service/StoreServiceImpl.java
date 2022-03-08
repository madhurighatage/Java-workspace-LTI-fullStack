package com.medical.Medical_Store.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.medical.Medical_Store.model.Store;
import com.medical.Medical_Store.repository.StoreRepository;
import com.store.customExceptions.RecordNotFoundException;
import com.store.util.BaseResponse;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreRepository storeRepository;

	@Override
	public ResponseEntity<Store> getBystoreId(int storeId) {
		Store store = storeRepository.findById(storeId).orElseThrow(() -> new RecordNotFoundException("store not exist with id :"+storeId));
		return ResponseEntity.ok(store);		
	}
	
	@Override
	public ResponseEntity<BaseResponse<Store>> save(Store store){
		if (storeRepository.findBygstNo(store.getgstNo()) != null) {
			BaseResponse<Store> base = new BaseResponse<>();
			String str = "Duplicate record...";
			base.setStatus("failed");
			base.setReasonText(str);
			//base.setResponseObject(store);
			base.setReasonCode("" + HttpStatus.ALREADY_REPORTED);
			return new ResponseEntity<BaseResponse<Store>>(base, HttpStatus.ALREADY_REPORTED);
		} else {
			BaseResponse<Store> base = new BaseResponse<>();
			store.setIsActive(1);
			store = storeRepository.save(store);
			base.setResponseObject(store);
			base.setStatus("success");
			base.setReasonText("Medical store is save successfully");
			base.setReasonCode("" + HttpStatus.CREATED);
			return new ResponseEntity<BaseResponse<Store>>(base, HttpStatus.CREATED);
		}
	}
	
	/*@Override
	public ResponseEntity<BaseResponse<Store>> getBystoreId(int storeId) {
		if(storeRepository.findBystoreId(storeId)==null) {
			BaseResponse<Store> base = new BaseResponse<>();
			String str = "Record Not Exist...";
			base.setStatus("failed");
			base.setReasonText(str);
			base.setReasonCode("" + HttpStatus.NOT_FOUND);
			return new ResponseEntity<BaseResponse<Store>>(base, HttpStatus.NOT_FOUND);
		}else {
			Store store = storeRepository.findBystoreId(storeId);
			BaseResponse<Store> base = new BaseResponse<>();
			base.setResponseObject(store);
			base.setStatus("success");
			base.setReasonText("Medical store found");
			base.setReasonCode("" + HttpStatus.OK);
			return new ResponseEntity<BaseResponse<Store>>(base, HttpStatus.OK);
		}
	}*/

	@Override
	public ResponseEntity<Map<String,Boolean>> deleteStore(int storeId) {
		
		Store store = storeRepository.findById(storeId).orElseThrow(() -> new RecordNotFoundException("store not exist with id :"+storeId));
		storeRepository.delete(store);
		Map<String, Boolean> response = new HashMap();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response); 
	}

	@Override
	public Store updateStor(int storeId, Store store) {
		try {
		if (storeRepository.findBygstNo(store.getgstNo()) != null) {
			BaseResponse<Store> base = new BaseResponse<>();
			String str = "Duplicate record...";
			base.setStatus("failed");
			base.setReasonText(str);
			//base.setResponseObject(store);
			base.setReasonCode("" + HttpStatus.ALREADY_REPORTED);
			return null;
		} else {
			Store newEntity =storeRepository.findBystoreId(storeId);
			System.out.println("store ---------------- " + store);
			newEntity.setStoreName(store.getStoreName());
			newEntity.setCity(store.getCity());
			newEntity.setIndiast(store.getIndiast());
			newEntity.setZipcode(store.getZipcode());
			newEntity.setgstNo(store.getgstNo());
			newEntity.setIsActive(1);
			newEntity.setStoreId(storeId);
			System.out.println("newEntity ---------------- " + newEntity);
			return storeRepository.save(newEntity);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public ResponseEntity<BaseResponse<Store>> getAll(){
		List<Store> storeList = (List<Store>) storeRepository.findAll();
		if (storeList.size() > 0) {
			BaseResponse<Store> base = new BaseResponse<>();
			storeList = storeRepository.findAll();
			base.setResponseListObject(storeList);
			base.setStatus("success");
			base.setReasonText("Medical store is save successfully");
			base.setReasonCode("" + HttpStatus.OK);
			return new ResponseEntity<BaseResponse<Store>>(base, HttpStatus.OK);
		} else {			
			BaseResponse<Store> base = new BaseResponse<>();
			String str = "No record available...";
			base.setStatus("failed");
			base.setReasonText(str);
			base.setResponseListObject(storeList);
			base.setReasonCode("" + HttpStatus.BAD_REQUEST);
			return new ResponseEntity<BaseResponse<Store>>(base, HttpStatus.BAD_REQUEST);
		}
		
	}

	@Override
	public Store getBygstNo(Long gstNo) {
		return storeRepository.findBygstNo(gstNo);
	}

	@Override
	public List<Store> getAllStores() {
		return storeRepository.findAll();
	}
}
