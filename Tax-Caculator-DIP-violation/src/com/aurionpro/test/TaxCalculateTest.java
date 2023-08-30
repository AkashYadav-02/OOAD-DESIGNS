package com.aurionpro.test;

import com.aurionpro.model.DBLogger;
import com.aurionpro.model.Logger;
import com.aurionpro.model.TaxCalculator;

public class TaxCalculateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = new DBLogger();
        TaxCalculator calculator = new TaxCalculator(logger);

        calculator.calculateTax(1000, 0);}

}
