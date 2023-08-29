package com.aurionpro.model;

public class Robot implements IWorker {

	
	@Override
	public void startWork() {
		System.out.println(" Robot start working");

	}

	@Override
	public void stopWork() {
		System.out.println(" Robot stop working");
	}

	@Override
	public void eat() {
		System.out.println(" Robot  eating");

	}

	@Override
	public void drink() {
		System.out.println(" Robot  drinking");

	}

}
