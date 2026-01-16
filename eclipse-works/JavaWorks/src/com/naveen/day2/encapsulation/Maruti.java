package com.naveen.day2.encapsulation;

public class Maruti extends Enginee{
	@Override
	public void start() {
		System.out.println("Maruti enginee is starting");
	}
	
	@Override
	public void stop(Tank tank) {
		System.out.println("Maruti Enginee stopping");
	}

}
