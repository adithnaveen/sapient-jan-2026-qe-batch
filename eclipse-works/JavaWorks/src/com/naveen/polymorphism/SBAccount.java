package com.naveen.polymorphism;

public class SBAccount extends Account{
	@Override
	public double checkBalance() {
		return super.getBalance(); 
	}
	public double studentInterest(boolean flag) {
		return flag?4:3.5;
	}	
	public SBAccount(int accountId, String holderName, double balance) {
		super(accountId, holderName, balance, "SB"); 
	}
	
}
