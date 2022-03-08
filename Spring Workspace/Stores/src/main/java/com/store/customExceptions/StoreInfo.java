package com.store.customExceptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.medical.Medical_Store.model.Store;


public class StoreInfo {

	@JsonProperty("store")
	private Store store;

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	
}
