package com.naveen.view;

import com.naveen.entity.PaymentProcessInformationEntity;

public class PaymentProcessingView {
	public void display(PaymentProcessInformationEntity ppie) {
		System.out.println("-------------------------------------");
		System.out.println("Payment Processed With Id " + ppie.getTransactionId());
		System.out.println("-------------------------------------");
	}
}
