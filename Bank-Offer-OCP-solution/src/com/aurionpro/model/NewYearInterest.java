package com.aurionpro.model;

public class NewYearInterest  implements IFestivalInterest{

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public String toString() {
		return "NewYearInterest [getInterestRate()=" + getInterestRate() + "]";
	}

}
