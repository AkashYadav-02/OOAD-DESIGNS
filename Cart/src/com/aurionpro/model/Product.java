package com.aurionpro.model;

public class Product {
	
	private int id;
	private String name;
	private double price;
	private double discoutPercent;
	private double discountedPrice;
	public Product(int id, String name, double price, double discoutPercent) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discoutPercent = discoutPercent;
		this.discountedPrice=calculateDiscountPrice();
	}
	public double getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscoutPercent() {
		return discoutPercent;
	}
	public void setDiscoutPercent(double discoutPercent) {
		this.discoutPercent = discoutPercent;
	}
  public  double calculateDiscountPrice() {
	  
	 //  price * (discoutPercent / 100);
      return price -( price * (discoutPercent / 100));
	  
  }
@Override
public String toString() {
	return "\nProduct [id=" + id + ", name=" + name + ", price=" + price + ", discoutPercent=" + discoutPercent
			+ ", discountedPrice=" + discountedPrice + "]";
}
}
