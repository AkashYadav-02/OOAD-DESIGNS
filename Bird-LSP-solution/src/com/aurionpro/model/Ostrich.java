package com.aurionpro.model;

public class Ostrich implements INonFlyable {

	

	@Override
	public void bodyColor() {
		 System.out.println("Bodycolour of  "+ this+" is White");
		 		
		
	}

	

	@Override
	public String toString() {
		return "Ostrich ";
	}



	@Override
	public void walk() {
		System.out.println(this+"Can Walk");
		
	}

}
