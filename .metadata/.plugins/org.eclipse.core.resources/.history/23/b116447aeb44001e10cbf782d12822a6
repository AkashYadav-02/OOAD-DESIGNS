package com.aurionpro.model;

public class FixedDeposit {

	private int accountNumber;
	private String name;
	private double principal;
	private double duration;
	private FestivalType festival;

	public FixedDeposit(int accountNumber, String name, double principal, double duration, FestivalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FestivalType getFestival() {
		return festival;
	}

	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public FestivalType getTestival() {
		return festival;
	}

	public void setTestival(FestivalType festival) {
		this.festival = festival;
	}

	public double getInterestRate() {
		switch (this.festival) {
		case DIWALI:
			return 8.5;
		case NEWYEAR:
			return 8;
		case HOLI:
			return 7.5;
		case OTHERS:
			return 6.5;

		default:
			return 0.0;

		}
	}

	public double calculateSimpleIntrest() {
		return (this.principal * this.duration * this.getInterestRate() * 0.01);
	}

	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principal=" + principal
				+ ", duration=" + duration + ", festival=" + festival + "]";
	}

}
