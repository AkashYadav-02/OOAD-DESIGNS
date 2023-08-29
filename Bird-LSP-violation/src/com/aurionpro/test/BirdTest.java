package com.aurionpro.test;

import com.aurionpro.model.Bird;
import com.aurionpro.model.Ostrich;
import com.aurionpro.model.Pigeon;
import com.aurionpro.model.Sparrow;

public class BirdTest {
 public static void main(String[] args) {
	
	 Bird sparrow=new Sparrow();
	 Bird pigeon=new Pigeon();
	Bird ostrich=new Ostrich();
	  
	sparrow.fly();
	pigeon.fly();
	ostrich.fly();
}
}
