package com.naveen.factory;

// since this is factory should we make this as singleton 

public class VehicleFactory {
	public  static IVehicle createVehicle(Types type) {

		switch (type) {
		case BIKE:
			return new Bike();
		case CAR:
			return new Car();
		case TRUCK:
			return new Truck();

		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
}
