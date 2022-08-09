package com.cognixia.jump.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Inventory;
import com.cognixia.jump.model.Orders;
import com.cognixia.jump.repository.InventoryRepository;

@Service
public class InventoryConsumerService {

	
	@Autowired
	InventoryRepository repo;
	
	@KafkaListener(topics ="orders",groupId= "order_group_id")
	public void consume (Orders orders) {
		
		System.out.println("Consuming order: " + orders);
	 
	 	Inventory inv = repo.findByName(orders.getItem());
		
		inv.setQuanity(inv.getQuanity() - orders.getQuantity() );
		
		repo.save(inv);
		
		
		
	}
}
