package com.aurionpro.model;

public class DBLogger  implements Logger{

	@Override
	public void log(String error) {
		// TODO Auto-generated method stub
		System.out.println("Logged to database: " + error);
		
	}
	
	

}
