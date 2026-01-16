package com.naveen.day2.encapsulation;

public class Tank {
	private int capacity; 
	private int fuleInTank; 
	
	public Tank(int capacity) {
		this.capacity = capacity; 
	}
	
	public int getCapacity() {
		return capacity;
	}
	public int getFuleInTank() {
		return fuleInTank;
	}

	public void setFuleInTank(int fuleInTank) {
		this.fuleInTank = fuleInTank;
	}
	
	public boolean isEmpty() {
		return this.fuleInTank==0; 
	}
}
