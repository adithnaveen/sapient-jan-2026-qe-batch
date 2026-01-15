package com.naveen.polymorphism;

public class SBAccount extends Account{

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return checkBalance();
	}

	public double studentInterest(boolean flag) {
		return flag?4:3.5;
	}	
	

	
	public SBAccount(int accountId, String holderName, double balance, String accountType) {
		super(accountId, holderName, balance, accountType); 
	}
	
}
