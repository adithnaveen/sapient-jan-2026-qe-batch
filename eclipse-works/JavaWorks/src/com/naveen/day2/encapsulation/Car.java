package com.naveen.day2.encapsulation;

public class Car {
	private Enginee enginee;
	private Tank tank;

	public Car() {
		enginee = new Enginee() {
			
			@Override
			public void start() {
				System.out.println("When fuel availalbe enginee will start ");
			}
		};
		tank = new Tank(100);
	}

	public Car(Enginee enginee, Tank tank) {
		this.enginee = enginee;
		this.tank = tank;
	}

	@Override
	public String toString() {
		return "Car [enginee=" + enginee + ", tank=" + tank + "]";
	}

	
}
