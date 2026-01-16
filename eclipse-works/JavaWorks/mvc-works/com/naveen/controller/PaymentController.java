package com.naveen.controller;

import com.naveen.entity.PaymentBean;
import com.naveen.entity.PaymentProcessInformationEntity;
import com.naveen.interfaces.IPaymentService;
import com.naveen.service.PaymentService;
import com.naveen.view.PaymentProcessingView;

public class PaymentController {
	
	// this class shall be a connect between view and service  -> dao
	
	IPaymentService service = new PaymentService();
	PaymentProcessingView ppv = new PaymentProcessingView();
	
	
	
	public void  process(String name, double amount) {
		 PaymentProcessInformationEntity payment = service.checkPayment(name, amount); 
		
		 ppv.display(payment);
		 
	}
	
}
