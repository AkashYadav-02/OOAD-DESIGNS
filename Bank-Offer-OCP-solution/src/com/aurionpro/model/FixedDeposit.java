package com.aurionpro.model;

public class FixedDeposit {

	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private IFestivalInterest interest;
	public FixedDeposit(int accountNumber, String name, double principal, int duration, IFestivalInterest interest) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.interest = interest;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public IFestivalInterest getInterest() {
		return interest;
	}
	public void setInterest(IFestivalInterest interest) {
		this.interest = interest;
	}
	
	public double calculateSimpleInterest() {
		return (this.principal * this.duration * this.interest.getInterestRate()*0.01) ;
	}
	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principal=" + principal
				+ ", duration=" + duration + ", interest=" + interest + "]";
	}
	
	
}

