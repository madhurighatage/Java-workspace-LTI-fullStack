package com.medical.Medical_Store.service;

import java.io.Serializable;
import java.util.List;

import com.medical.Medical_Store.model.Store;


public interface CRUDService<E> {
	E save(E entity);

	E getById(Serializable id);

	List<E> findAllStor();

	void delete(Serializable id);

	Store getBygstNo(long gstNo);
	
	Store getBystoreId(int storeId);

	
}
