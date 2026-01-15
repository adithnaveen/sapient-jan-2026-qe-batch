package com.naveen.polymorphism;

/// for the class you have have multiple constructor like default which does not accept any parameters 
/// parametric constructor which take the values and assign it 
/// 
public class Account {
	private int accountId; 
	private String holderName;
	private double balance; 
	private String accountType; 

	// this is valid, if the user does not pass the value then default constructor is called 
	public Account() {
		super();
	}
	// create a parametric constructor 
	public Account(int accountId, String holderName, double balance, String accountType) {
		super();
		this.accountId = accountId;
		this.holderName = holderName;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}


	
	
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", holderName=" + holderName + ", balance=" + balance
				+ ", accountType=" + accountType + "]";
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	public double checkBalance() {
		System.out.println("in Account class>>>> ");
		return this.balance; 
	}


	
	
}
