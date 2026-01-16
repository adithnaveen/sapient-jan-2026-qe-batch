package com.naveen.factory;

public class Car implements IVehicle {

	public Car() {
		System.out.println("Car Creating... ");
	}
	public void soundSystem() {
		System.out.println("Car has nice sound Speakers");
	}

	@Override
	public void move() {
		System.out.println("Car is moving...");
	}
}
