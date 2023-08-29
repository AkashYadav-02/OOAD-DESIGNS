package com.aurionpro.model;

public class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpec specs;


	public Guitar(String serialNumber, double price, GuitarSpec specs) {
		
		this.serialNumber = serialNumber;
		this.price = price;
		this.specs = specs;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getSerialNumber() {
		return serialNumber;
	}



	public double getPrice() {
		return price;
	}

	public GuitarSpec getSpecs() {
		return specs;
	}



	@Override
	public String toString() {
		return "\nGuitar [serialNumber=" + serialNumber + ", price=" + price + ", specs=" + specs + "]";
	}



	

}