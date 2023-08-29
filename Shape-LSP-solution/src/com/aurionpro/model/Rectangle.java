package com.aurionpro.model;

public class Rectangle  implements IShape {
	
	private double height;
	private double width;
	public Rectangle(double height, double width) {
		
		this.height = height;
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public double calcualteArea( ) {
		
		return height*width;
	}
	

}
