package com.naveen.day2.encapsulation;

public  class Enginee {
	public void start() {
		System.out.println("Enginee is starring");
	}

	// make it concrete to show case
	public void stop(Tank tank) {
		if (tank.isEmpty())
			System.out.println("Enginee stops where there is no fuel");
		else
			System.out.println("No Problem you have fuel of " 
					+ tank.getFuleInTank());
	}

	@Override
	public String toString() {
		return "Enginee is getting returned";
	}
}
