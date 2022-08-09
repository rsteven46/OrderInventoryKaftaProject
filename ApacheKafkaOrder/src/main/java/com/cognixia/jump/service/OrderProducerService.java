package com.cognixia.jump.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Orders;

@Service
public class OrderProducerService {

	
	@Autowired
	private KafkaTemplate<String, Orders> kafkaTemplate;
	
	public void produce(Orders order) {
		
		System.out.println("Producing order: " + order);
		
		kafkaTemplate.send("orders", order);
		
	}
}
