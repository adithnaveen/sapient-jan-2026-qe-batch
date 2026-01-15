package com.naveen.polymorphism;



class ProcessAccount {
	
	public static void printAccountBalance(Account account) {
		System.out.println(account.checkBalance());
		
		if(account instanceof SBAccount) {
			System.out.println(((SBAccount)account).studentInterest(true));
		}
	}
	
}

public class AccountImpl {
	public static void main(String[] args) {

		Account[] accounts = new Account[] {
				new SBAccount(101, "Harish", 1234), 
				new CAAccount(222, "Business INC", 3322), 
				new CAAccount(222, "Business1 INC", 3322), 
				new CAAccount(222, "Business2 INC", 3322)
		};

		for(Account acc : accounts) {
			ProcessAccount.printAccountBalance(acc);
		}
		
		
	}
}
