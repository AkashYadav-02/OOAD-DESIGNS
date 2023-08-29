package com.aurionpro.model;

public class Sparrow  implements  IFlyable{

	@Override
	public void bodyColor() {
		System.out.println("Body Colour of "+this+" is brown ");
		
	}

	@Override
	public void fly() {
		System.out.println(this+"can fly");
		
	}

	@Override
	public String toString() {
		return "Sparrow ";
	}
 

		

}
