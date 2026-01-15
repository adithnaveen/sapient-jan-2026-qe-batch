package com.naveen.polymorphism;

public class CAAccount extends Account{

	public CAAccount(int accountId, String holderName, double balance) {
		super(accountId, holderName, balance, "CA");
	}
	@Override
	public double checkBalance() {
		return super.getBalance();
	}
	public int chequeLeaf() {
		return 100;
	}
}
