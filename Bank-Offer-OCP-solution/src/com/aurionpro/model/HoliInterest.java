package com.aurionpro.model;

public class HoliInterest  implements IFestivalInterest{

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 7.5;
	}

	@Override
	public String toString() {
		return "HoliInterest [getInterestRate()=" + getInterestRate() + "]";
	}
 
}
