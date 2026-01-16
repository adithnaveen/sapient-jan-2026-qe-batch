package com.naveen.day2.statics;

public class StaticExample1 {

	
	int instance1; 
	private static int staticInstance1; 
	
	{
		System.out.println("hi i'm instance block");
		staticInstance1 = 123; 
	}

	static {
		System.out.println("hi i'm static block1 " + staticInstance1);
		
	}

	static {
		System.out.println("hi i'm static block2");
	}
	
	public static void main(String []args) {
		System.out.println("hi i'm in main");
		
		new StaticExample1();
		
	}
	

	static {
		System.out.println("hi i'm static block3");
	}
	
}
