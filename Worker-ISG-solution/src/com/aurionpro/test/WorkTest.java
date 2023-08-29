package com.aurionpro.test;


import com.aurionpro.model.IWorkable;
import com.aurionpro.model.IWorker;
import com.aurionpro.model.Labour;
import com.aurionpro.model.Robot;

public class WorkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker labour=new Labour();
		IWorkable robot=new Robot();
		labour.rest();
		labour.eat();
		labour.start();
		labour.stop();
//		robot.rs();
//		robot.eat();
		robot.start();
		robot.stop();

	}

}
