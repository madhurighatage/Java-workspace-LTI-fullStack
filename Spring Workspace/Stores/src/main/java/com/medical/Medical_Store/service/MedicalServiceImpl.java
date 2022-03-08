package com.medical.Medical_Store.service;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.medical.Medical_Store.exception.ResourceNotFoundException;
import com.medical.Medical_Store.model.Medicine;
import com.medical.Medical_Store.model.Store;
import com.medical.Medical_Store.repository.MedicineRepository;
import com.medical.Medical_Store.repository.StoreRepository;

@Service
public class MedicalServiceImpl implements MedicalService {
	
	@Autowired
	private MedicineRepository medicineRepository;
	
	@Autowired
	private StoreRepository storeRepository;

	@Override
	public List<Medicine> getAllMedicine() {
		// TODO Auto-generated method stub
		return medicineRepository.findAll();
	}

	@Override
	public Medicine createMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		return medicineRepository.save(medicine);
	}

	@Override
	public String createAllMeds(List<Medicine> medicineList) {
		// TODO Auto-generated method stub
		List<Medicine> savedMedicineList = new ArrayList<>();
		medicineRepository.saveAll(medicineList).forEach(savedMedicineList::add);
		return "Sucessfully inserted all records";
	}

	@Override
	public ResponseEntity<Medicine> getMedicine(long id) {
		// TODO Auto-generated method stud
		Medicine medicine = medicineRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Medicine not exist with id :"+id));
		return ResponseEntity.ok(medicine);
		
	}

	@Override
	public ResponseEntity<Map<String, Boolean>> deleteMedicine(long id) {
		// TODO Auto-generated method stub
		Medicine medicine = medicineRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Medicine not exist with id :"+id));
		medicineRepository.delete(medicine);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response); 
	}

	@Override
	public ResponseEntity<Medicine> updateMedicine(long medId, Medicine medicine) {
		// TODO Auto-generated method stub
			Medicine med = medicineRepository.findById(medId).orElseThrow(() -> new ResourceNotFoundException("Medicine not exist with id :"+medId));
			med.setStoreId(medicine.getStoreId());
			med.setName(medicine.getName());
			med.setQuantity(medicine.getQuantity());
			med.setPrice(medicine.getPrice());
			med.setMg(medicine.getMg());
			Medicine updatedmedicine = medicineRepository.save(med);
			return ResponseEntity.ok(updatedmedicine);
	}

	@Override
	public List<Medicine> getMedicineByStoreId(int id) {
		// TODO Auto-generated method stub
		List<Medicine> medicine = medicineRepository.findByStoreId(id);
		return medicine;
	}

	@Override
	public Medicine createMedicineByStoreId(int storeId, Medicine medicine) {
		//Store  stores = storeRepository.findBystoreId(storeId);
		medicine.setStoreId(storeId);
		return medicineRepository.save(medicine);
	}
	
	
	
	
}