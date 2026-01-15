package com.naveen;

public class CustomerApp {
	public static void main(String args[]) {
		Customer cust = new Customer(); 

		cust.setCustId(101);
		cust.setAge(20);
		cust.setCustName("Chanchal");
		System.out.println("Stored At " + cust.hashCode());
		
		System.out.println(cust);
	}
	
}
