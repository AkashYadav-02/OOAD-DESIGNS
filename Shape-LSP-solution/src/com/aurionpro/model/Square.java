package com.aurionpro.model;

public class Square implements IShape {

	private double side;
	private double width;
	public Square(double height) {
		
		this.side = side;
		
	}
	public double getSide() {
		return side;
	}
	public void  setSide(double side) {
		this.side=side;
	}
	@Override
	public double calcualteArea() {
		// TODO Auto-generated method stub
		return Math.pow(side, 2);
	}

}
