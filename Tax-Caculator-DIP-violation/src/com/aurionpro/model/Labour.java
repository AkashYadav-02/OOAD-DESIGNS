package com.aurionpro.model;

public class Labour implements IWorker {

	@Override
	public void startWork() {
		System.out.println(" Worker start working");

	}

	@Override
	public void stopWork() {
		System.out.println(" Worker stop working");
	}

	@Override
	public void eat() {
		System.out.println(" Worker  eating");

	}

	@Override
	public void drink() {
		System.out.println(" Worker  drinking");

	}

}
