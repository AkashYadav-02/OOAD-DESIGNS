package com.aurionpro.model;

public class TaxCalculator extends DBLogger {
	
	
	private DBLogger dblogger;

	
	public void calculateTax(int amount,int rate) {
		 double tax=0;
		 try {
			 tax=amount/rate;
			 System.out.println( "Tax on  Amount "+amount +" with rate of "+rate+" is :" +tax);
		 }
		 catch(Exception e) {
			 new DBLogger().log("Diveded by Zero");
		 }
	}
	
	
}
