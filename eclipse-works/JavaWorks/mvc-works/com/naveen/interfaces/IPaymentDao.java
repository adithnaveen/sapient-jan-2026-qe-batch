package com.naveen.interfaces;

import com.naveen.entity.PaymentProcessInformationEntity;

public interface IPaymentDao {
	public PaymentProcessInformationEntity pay(String name, double amount) ; 
}
