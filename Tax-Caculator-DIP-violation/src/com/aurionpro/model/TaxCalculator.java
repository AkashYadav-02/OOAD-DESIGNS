package com.aurionpro.model;

public class TaxCalculator  {
	
	
	private Logger logger;

    public TaxCalculator(Logger logger) {
        this.logger = logger;
    }

    public void calculateTax(int amount, int rate) {
        double tax = 0;
        try {
            tax = amount / rate;
            System.out.println("Tax on Amount " + amount + " with rate of " + rate + " is: " + tax);
        } catch (Exception e) {
            logger.log("Divided by Zero");
        }
    }
}
