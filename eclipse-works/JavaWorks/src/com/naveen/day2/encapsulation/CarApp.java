package com.naveen.day2.encapsulation;

public class CarApp {
	public static void main(String args[]) {
		Car car1 = new Car() ;
		
		
		
		Enginee e = new Enginee();
		Tank t = new Tank(123);
		Car car2 = new Car(e, t); 
	
		
		Enginee e1 = new Toyota();
		Tank t1 = new Tank(200);
		Car car3 = new Car(e1, t1); 
	

		System.out.println("Car is " + car1);
		car1.getEnginee().start(); 
		// this will not work as we have not passed the tank 
		// referring to null 
		
		car1.getTank().isEmpty();
		System.out.println("---------------------");

		System.out.println("Car is " + car2);
		car2.getEnginee().start(); 
		car2.getTank().isEmpty();
		car2.getTank().setFuleInTank(0);
		car2.getTank().isEmpty();
		System.out.println("Car is " + car2);
		
		System.out.println("---------------------");
		System.out.println("Car is " + car3);
		car3.getEnginee().start(); 
		car3.getTank().isEmpty();
		
		System.out.println("---------------------");
		
	}
	
}
