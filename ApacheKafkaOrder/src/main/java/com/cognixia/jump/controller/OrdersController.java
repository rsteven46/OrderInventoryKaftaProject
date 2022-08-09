package com.cognixia.jump.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Orders;

import com.cognixia.jump.repository.OrdersRepository;
import com.cognixia.jump.service.OrderProducerService;

@RequestMapping("/api/order")
@RestController
public class OrdersController {
	
	@Autowired
	OrdersRepository service;
	
	@Autowired
	OrderProducerService producerService;
	
	
	@GetMapping("/orders")
	public List<Orders> getOrders(){
		return service.findAll();
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> createOrder(@RequestBody Orders orders){
	
	
		
		Orders newOrders=service.save(orders);
		
		System.out.println("New order added " + orders);
		
		
		producerService.produce(newOrders);
		return ResponseEntity.ok(newOrders + " created");
		
		
	}
	

}
