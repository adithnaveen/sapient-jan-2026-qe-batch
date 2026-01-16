package com.naveen.day2.encapsulation;

public class Maruti extends Car{

	private Tank tank; 
	private Enginee enginee;
	
	public Maruti(Tank tank, Enginee enginee) {
		this.tank = tank; 
		this.enginee = enginee; 
	}
	
	public void marutiStart() {
		super.getEnginee().start(); 
	}
	
	public void marutiStop() {
		super.getEnginee().stop(tank);
	}
}
