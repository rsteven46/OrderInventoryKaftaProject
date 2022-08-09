package com.cognixia.jump.model;

import java.io.Serializable;
import java.util.Date;


public class Orders implements Serializable {

	private static final long serialVersionUID = 1L;


	private Integer id;
	

	private Date date;
	

	private String item;
	

	private Integer quantity;
	
	public Orders() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", item=" + item + ", quantity=" + quantity + "]";
	}
	
	
	
}
