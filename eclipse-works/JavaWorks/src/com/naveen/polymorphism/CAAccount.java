package com.naveen.polymorphism;

public class CAAccount extends Account{

	public CAAccount(int accountId, String holderName, double balance, String accountType) {
		super(accountId, holderName, balance, accountType);
	}

	@Override
	public double checkBalance() {
		return super.checkBalance();
	}

	public int chequeLeaf() {
		return 100;
	}
}
