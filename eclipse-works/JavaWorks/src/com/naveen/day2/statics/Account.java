package com.naveen.day2.statics;

public class Account {
	private int accountId; 
	private String accountHolderName; 
	private double initialBalance; 
	
	
	static int counter = 100;


	public Account(String accountHolderName, double initialBalance) {
		super();
		this.accountId = ++ counter;
		this.accountHolderName = accountHolderName;
		this.initialBalance = initialBalance;
	}


	public double getInitialBalance() {
		return initialBalance;
	}


	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}


	public int getAccountId() {
		return accountId;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public static int getCounter() {
		return counter;
	} 
	
	
	
}
