package com.naveen;


public class StringManuiplations {
	public static void main(String [] args) {
		String myString = "Naveen Kumar"; 
		String yourString ="Something Interesting"; 
		String emptyString=""; 
		
		System.out.println("length :" + myString.length());
		System.out.println("Concat value:" + myString.concat(yourString));
		System.out.println("chat at 0" + myString.charAt(0));
		System.out.println("emptyString :" + emptyString.isEmpty());
		System.out.println("length :" + myString.substring(3));
		System.out.println(myString.toUpperCase()); 
		
		String newMyString = myString.toUpperCase(); 
		System.out.println("newMyString hasCode " + newMyString.hashCode());
		System.out.println("myString hasCode " + myString.hashCode());
	
		StringBuffer sb = new StringBuffer("StringBuffer"); 
	}
}
