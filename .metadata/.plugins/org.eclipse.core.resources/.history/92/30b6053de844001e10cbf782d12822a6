package com.aurionpro.model;

public class Employee {
	private int id;
	private String name;
	private double basic;
	private double hra;
	private double da;
	private double ta;
	private double salary;

	public Employee(int id, String name, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
		this.hra = .20;
		this.da = .15;
		this.ta = .1;
		this.salary = calculateTotalSalary();
	}

	public double calculateTotalSalary() {
		return this.basic + this.basic * this.hra + this.basic * this.da + this.basic * this.ta;
	}

	public double calculateTax() {
		if (this.salary * 12 > 800000.0 && this.salary * 12 < 1000000.0) {
			return this.salary * .2;
		}
		if (this.salary * 12 > 500000.0 && this.salary * 12 < 800000.0) {
			return this.salary * .1;
		}
		if (this.salary * 12 > 1000000.0) {
			return this.salary * .3;
		}
		return this.salary;
	}

	public void printSalarySlip() {
		double tax = this.salary - this.calculateTax();
		System.out.println(" Net Salary is " + this.salary);
		System.out.println("  Basic  " + this.basic);
		System.out.println(" HRA " + this.hra);
		System.out.println(" TA " + this.ta);
		System.out.println(" DA " + this.da);

		System.out.println(" sala" + tax);
		// System.out.println( " tax on salary" + tax);
	}

}
