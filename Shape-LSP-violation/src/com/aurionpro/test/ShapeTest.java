package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;

public class ShapeTest {
public static void main(String[] args) {
	
	Rectangle obj=new Square(20);
	 System.out.println(isRectangle(obj));
	
}

private static  boolean isRectangle(Rectangle obj) {
	double prev=obj.getHeight();
	System.out.println(obj.getWidth());
	System.out.println(obj.getHeight());
	//changing height 
	obj.setHeight(100);
	double cur=obj.getHeight();
	
	return prev==cur?true:false ;
}
}
