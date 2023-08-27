package com.aurionpro.model;

public class LineItem {

	
	private int id;
	private int quantity;
	private double itemPrice;
	
	private Product product;

	public LineItem(int id, int quantity, Product product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.product = product;
		this.itemPrice=calculateLineItemCost();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double calculateLineItemCost() {
		
		return quantity*product.getDiscountedPrice();
	}
  
	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "\nLineItem [id=" + id + ", quantity=" + quantity + ", itemPrice=" + itemPrice + ", product=" + product
				+ "]";
	}
	
}
