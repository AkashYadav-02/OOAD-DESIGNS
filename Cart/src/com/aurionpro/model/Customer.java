package com.aurionpro.model;

import java.util.List;

public class Customer {
	
	private int id;
	private String name;
	private List<Order> order;
	
	public Customer(int id, String name, List<Order> order) {
		super();
		this.id = id;
		this.name = name;
		this.order = order;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Order> getOrder() {
		return order;
	}
	public void setOrder(List<Order> order) {
		this.order = order;
	}
	
	@Override
	public String toString() {
		return "\nCustomer [id=" + id + ", name=" + name + ", order=" + order + "]";
	}
	

}
