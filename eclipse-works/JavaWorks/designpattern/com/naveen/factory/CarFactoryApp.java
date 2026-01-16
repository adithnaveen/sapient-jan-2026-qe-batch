package com.naveen.factory;

import static com.naveen.factory.Movement.movement; 


public class CarFactoryApp {
	public static void main(String[] args) {
		IVehicle car = VehicleFactory.createVehicle(Types.CAR); 
		IVehicle truck = VehicleFactory.createVehicle(Types.TRUCK); 
		IVehicle bike = VehicleFactory.createVehicle(Types.BIKE); 

		movement(car);
		movement(bike);
		movement(truck);
	}
}
