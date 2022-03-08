package com.medical.Medical_Store.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medical.Medical_Store.model.Medicine;
import com.medical.Medical_Store.model.Store;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long>{

	List<Medicine> findByStoreId(int id);
	
	public List<Store> findBystoreId(int storeid);
	
}
