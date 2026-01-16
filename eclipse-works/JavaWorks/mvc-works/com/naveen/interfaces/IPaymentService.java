package com.naveen.interfaces;

import com.naveen.entity.PaymentProcessInformationEntity;

public interface IPaymentService {
	public PaymentProcessInformationEntity checkPayment(String name, double amount); 
}
