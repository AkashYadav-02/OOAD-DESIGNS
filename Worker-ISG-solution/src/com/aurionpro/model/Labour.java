package com.aurionpro.model;

public class Labour implements IWorker {

	@Override
	public void start() {
		System.out.println(" Worker start working");

	}

	@Override
	public void stop() {
		System.out.println(" Worker stop working");
	}

	@Override
	public void eat() {
		System.out.println(" Worker  eating");

	}

	@Override
	public void rest() {
		System.out.println(" Worker  rest");

	}

}
