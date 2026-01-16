package com.naveen.day2.statics;

public class AccountCreationImpl {
	public static void main(String [] args) {
		Account accounts [] = new Account[]{
			new Account("Tanu", 1234), 
			new Account("Riddhi", 2233), 
			new Account("Vedant", 3344)
		};
		
		
		for(Account acc : accounts) {
			System.out.println("Account Number " + acc.getAccountId() 
				+", Holder " + acc.getAccountHolderName() 
				+", " + acc.getInitialBalance());
		}
		
		System.out.println("Current Counter Value " + Account.getCounter());
	}
}
