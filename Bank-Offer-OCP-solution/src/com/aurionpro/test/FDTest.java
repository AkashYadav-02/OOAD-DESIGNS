package com.aurionpro.test;


import com.aurionpro.model.DiwaliInterest;

import com.aurionpro.model.FixedDeposit;
import com.aurionpro.model.HoliInterest;

public class FDTest {
 public static void main(String[] args) {
	
	 FixedDeposit fd=new FixedDeposit(10111,"Akash Yadav",20000,4,new DiwaliInterest());
	  System.out.println(fd);
   FixedDeposit fixed = new FixedDeposit(101, "RAM", 10000, 5, new HoliInterest());
 System.out.println(fixed);
}
}
