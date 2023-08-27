package com.aurionpro.model;

public class Employee {
	private int id;
	private String name;
	private double basic;
	private double hra;
	private double da;
	private double ta;

	public Employee(int id, String name, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
		this.hra = 0.2 * basic;
		this.da = 0.15 * basic;
		this.ta = 0.1 * basic;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	public double calculateMonthlySalary() {
		return basic + hra + da + ta;
	}

}
