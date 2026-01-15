package com.other;

import com.naveen.Customer;

public class CustomerInhe extends Customer{	
	// for testing the scope of variables / methods 
	
	void checkAccess() {
//		custId = 1222; // its private not visible 
		
		getCustId(); // the scope is public its visible 
		checkProtected(); 
	}
	
}



