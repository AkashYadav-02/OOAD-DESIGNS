package com.aurionpro.test;

import com.aurionpro.model.IWorker;
import com.aurionpro.model.Labour;
import com.aurionpro.model.Robot;

public class WorkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker labour=new Labour();
		IWorker robot=new Robot();
		labour.drink();
		labour.eat();
		labour.startWork();
		labour.stopWork();
		robot.drink();
		robot.eat();
		robot.startWork();
		robot.stopWork();

	}

}
