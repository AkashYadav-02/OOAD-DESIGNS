package com.aurionpro.model;

import java.util.Date;
import java.util.List;

public class Order {
	
	private int id;
	private Date date;
	private double totalprice;

 private List<LineItem>item;

	public Order(int id, Date date, List<LineItem> item) {
		super();
		this.id = id;
		this.date = date;
		this.item = item;
		this.totalprice=orderPriceList();
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
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

	public List<LineItem> getItem() {
		return item;
	}

	public void setItem(List<LineItem> item) {
		this.item = item;
	}

	 public double orderPriceList() {
		 double totalPrice = item.stream()
		            .mapToDouble(LineItem::getItemPrice) // Extract item prices
		            .sum(); 
		
		return totalPrice;
		 
		 
	 }
	 
	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", totalprice=" + totalprice + ", item=" + item + "]";
	}
	 
	 
	 
}
