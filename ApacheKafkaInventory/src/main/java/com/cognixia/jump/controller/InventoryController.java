package com.cognixia.jump.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Inventory;

import com.cognixia.jump.repository.InventoryRepository;
import com.cognixia.jump.service.InventoryConsumerService;

@RequestMapping("/api/inventory")
@RestController
public class InventoryController {

	@Autowired
	InventoryRepository repo;
	
	@Autowired
	InventoryConsumerService service;
	
//	@PutMapping("/orders")
//	public ResponseEntity<?> updateInventory(){
//		
//		
//		Inventory inv = repo.findByName(service.newOrder.getItem());
//		
//		inv.setQuanity(inv.getQuanity() - service.newOrder.getQuantity() );
//		
//		repo.save(inv);
//		
//		return ResponseEntity.status(201).body(inv);
//	}
//	
	
}
