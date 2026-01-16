package com.naveen.day2.encapsulation;

public class Car {
	private Enginee enginee;
	private Tank tank;

	public Car() {
		this.enginee = new Enginee() {
			
			@Override
			public void start() {
				System.out.println("When fuel availalbe enginee will start ");
			}
		};
		this.tank = new Tank(100);
	}

	public Car(Enginee enginee, Tank tank) {
		this.enginee = enginee;
		this.tank = tank;
	}
	
	

	public Enginee getEnginee() {
		return enginee;
	}

	public Tank getTank() {
		return tank;
	}

	@Override
	public String toString() {
		return "Car [enginee=" + enginee + ", tank=" + tank + "]";
	}

	
}
