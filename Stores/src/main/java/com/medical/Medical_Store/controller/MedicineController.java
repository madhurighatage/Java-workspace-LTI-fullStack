package com.medical.Medical_Store.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.Medical_Store.model.Medicine;
import com.medical.Medical_Store.model.Store;
import com.medical.Medical_Store.repository.StoreRepository;
import com.medical.Medical_Store.service.MedicalService;
import com.medical.Medical_Store.service.StoreService;
import com.store.util.BaseResponse;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class MedicineController {

	@Autowired
	private MedicalService medicalservice;
	
	@Autowired
	StoreService service;
	
	@Autowired
	StoreRepository storeRepo;
	
	@GetMapping("medicines")
	public List<Medicine> getAllMedicine() {
		return medicalservice.getAllMedicine();
	}
	
	@GetMapping("medicines/{id}")
	public ResponseEntity<Medicine> getMedicine(@PathVariable long id){
		return medicalservice.getMedicine(id);
	}
	
	@GetMapping("store/{id}")
	public List<Medicine> getMedicineByStoreId(@PathVariable int id){
		return medicalservice.getMedicineByStoreId(id);
	}
	
	@PostMapping("medicines")
	public Medicine createMedicine(@RequestBody Medicine medicine) {
		return medicalservice.createMedicine(medicine);
	}
	
	@PostMapping("saveall")
	public String createAllMeds(@RequestBody List<Medicine> medicineList) {
		for(Medicine medicine : medicineList) {
			if(medicine.getName()==null || medicine.getName()=="") {
				return "Please Enter Medicine Name";
			}
		}
		return medicalservice.createAllMeds(medicineList);
	}
	
	@DeleteMapping("medicines/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteMedicine(@PathVariable long id) {
		return medicalservice.deleteMedicine(id);
	}
	
	@PutMapping("medicines/{medId}")
	public ResponseEntity<Medicine> updateMedicine(@PathVariable long medId, @RequestBody Medicine medicine){
		return medicalservice.updateMedicine(medId, medicine);
	}
	


	@PostMapping("/")
	public ResponseEntity<BaseResponse<Store>> addStore(HttpServletRequest request, @RequestBody Store store) {
		BaseResponse<Store> base = new BaseResponse<>();
		if (store.getgstNo() == null) {
			String str = "GST Number is null";
			
			base.setStatus("failed");
			base.setReasonText(str);
			base.setReasonCode("" + HttpStatus.NO_CONTENT);
			return new ResponseEntity<BaseResponse<Store>>(base, HttpStatus.NO_CONTENT);
		} else {
			ResponseEntity<BaseResponse<Store>> response = service.save(store);
		
			return response;
		}
	}

	@PutMapping("/{storeId}")
	public ResponseEntity<BaseResponse<Store>> updateStore(@PathVariable("storeId") int storeid,
			@RequestBody Store store) {
		BaseResponse<Store> base = new BaseResponse<>();
		Store existingstore = storeRepo.findBystoreId(storeid);
		System.out.println(" Store is : " + existingstore);
		if (existingstore == null) {
			base.setStatus("failed");
			base.setReasonText("Store id : " + store.getStoreId() + " not available");
		
			base.setReasonCode("" + HttpStatus.NOT_FOUND);
			return new ResponseEntity<BaseResponse<Store>>(base, HttpStatus.NOT_FOUND);
		} else {
			Store updated = service.updateStor(storeid, store);
			base.setResponseObject(updated);
			base.setStatus("success");

			base.setReasonText("Medical store has been updated successfully");
			base.setReasonCode("" + HttpStatus.OK);
			return new ResponseEntity<BaseResponse<Store>>(base, HttpStatus.CREATED);
		}
	}

	@GetMapping("/all")
	public ResponseEntity<BaseResponse<Store>> findAllStore() {
		ResponseEntity<BaseResponse<Store>> list = service.getAll();
		return list;
	}

	@GetMapping("/")
	public List<Store> getAllStores(){
		return service.getAllStores();
	}
	
	@GetMapping("/{storeId}")
	public ResponseEntity<Store> getStoreId(@PathVariable int storeId) {
		ResponseEntity<Store> response = service.getBystoreId(storeId);
		return response;
	}
	
	@DeleteMapping("/{storeId}")
	public ResponseEntity<Map<String,Boolean>> deleteStore(@PathVariable("storeId") int storeId) {
		return service.deleteStore(storeId);
	}
	
	@PostMapping("med/{storeId}")
	public Medicine createMedicineByStoreId(@PathVariable int storeId, @RequestBody Medicine medicine) {
		return medicalservice.createMedicineByStoreId(storeId, medicine);
	}
	
}
