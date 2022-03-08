package com.medical.Medical_Store.service;


import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.medical.Medical_Store.model.Medicine;


public interface MedicalService {

	List<Medicine> getAllMedicine();
	String createAllMeds(List<Medicine> medicineList);
	Medicine createMedicine(Medicine medicine);
	ResponseEntity<Medicine> getMedicine(long id);
	ResponseEntity<Map<String, Boolean>> deleteMedicine(long id);
	ResponseEntity<Medicine> updateMedicine(long medId, Medicine medicine);
	List<Medicine> getMedicineByStoreId(int id);
	Medicine createMedicineByStoreId(int storeId, Medicine medicine);
}
