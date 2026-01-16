package com.naveen.factory;

public class Movement {
	public static void movement(IVehicle vehicle) {
		vehicle.move(); 
		
		if(vehicle instanceof Bike) {
			((Bike) vehicle).bikeType(); 
		}else if(vehicle instanceof Car ) {
			((Car) vehicle).soundSystem();
		}else if(vehicle instanceof Truck) {
			((Truck) vehicle).loadCapacity();
		}
	}
}
