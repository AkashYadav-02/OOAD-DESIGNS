package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> product=Arrays.asList(
				new Product(1,"TV",20000,10.0),
				new Product(2,"Iphone",90000,5.0),
				new Product(1,"S23",70000,4.0),
				
				new Product(1,"Iwatch",40000,5.6)
				);
		
// for (Product prod : product) {
//	            System.out.println("item: " + prod.calculateDiscountPrice());
//	        }
//		
		List<LineItem>item=Arrays.asList(new LineItem(1,3,product.get(0)),
				new LineItem(2,2,product.get(3)),
				new LineItem(3,4,product.get(2))
				);
//		
//		 for (LineItem prod : item) {
//        System.out.println("Product: " + prod.getItemPrice());
//      }
		
		List<Order>order=Arrays.asList(
				new Order(1,new Date(),item)
				
				);	
		
		//System.out.println(order.get(0).getTotalprice());
		
		 
		
		List<Customer>customer= Arrays.asList(
				new Customer(1,"Yash",order) );
		System.out.println(customer.get(0));
	 
		
	//	System.out.println(customer);

	}

}
