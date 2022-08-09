package com.cognixia.jump.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognixia.jump.model.Inventory;

public interface InventoryRepository  extends JpaRepository<Inventory, Integer>{

	
	
	Inventory findByName(String item);

	

	
	
}
