package com.aurionpro.model;

public  class Pigeon  implements IFlyable{

	@Override
	public String toString() {
		return "Pigeon";
	}

	@Override
	public void bodyColor() {
		System.out.println("Body Colour of "+this+" is blue ");
		
	}

	@Override
	public void fly() {
		System.out.println(this+"can fly");
		
	}

	

}
