package com.aurionpro.test;

import com.aurionpro.model.IBird;
import com.aurionpro.model.Ostrich;
import com.aurionpro.model.Pigeon;
import com.aurionpro.model.Sparrow;

public class BirdTest {
 public static void main(String[] args) {
	
	 Sparrow sparrow= new Sparrow();
Pigeon pigeon=new Pigeon();
 Ostrich ostrich=new Ostrich();
	  
   sparrow.fly();
   sparrow.bodyColor();
   pigeon.fly();
   pigeon.bodyColor();
   
	ostrich.walk();
	ostrich.bodyColor();
}
}
