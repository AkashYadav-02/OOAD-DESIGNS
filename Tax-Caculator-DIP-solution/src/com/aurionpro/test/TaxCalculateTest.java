package com.aurionpro.test;

import com.aurionpro.model.TaxCalculator;

public class TaxCalculateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		TaxCalculator t1=new TaxCalculator();
		t1.calculateTax(100, 10);
		TaxCalculator t2=new TaxCalculator();
		t2.calculateTax(2000, 0);
	}

}
