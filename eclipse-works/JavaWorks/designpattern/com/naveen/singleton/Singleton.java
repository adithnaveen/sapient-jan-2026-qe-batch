package com.naveen.singleton;

public class Singleton {

	// eager loading 
//	Singleton singleton1 = new Singleton(); 
	
	
	// constructor is the place where object is 
	// constructed 
	private Singleton() {
		super();
	}
	
	public static  Singleton getInstance
		(Singleton singleton){
		if(singleton == null) {
			System.out.println("Creating instance... ");
			return new Singleton();
		}
		return singleton; 
	}
	
}
