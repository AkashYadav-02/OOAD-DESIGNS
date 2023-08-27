package com.aurionpro.model;

public class TaxUtil {
	
	public double calculateTax(Employee employee) {
		double annnualSalary = employee.calculateMonthlySalary() * 12;
		if(annnualSalary>=500000 && annnualSalary<=800000) {
			return annnualSalary*0.1;
		}
		if(annnualSalary>800000 && annnualSalary<=1000000) {
			return annnualSalary*0.2;
		}
		if(annnualSalary>1000000) {
			return annnualSalary*0.3;
		}
		return 0;
	}

}
