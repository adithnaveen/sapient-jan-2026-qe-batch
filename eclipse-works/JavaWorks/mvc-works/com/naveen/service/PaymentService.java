package com.naveen.service;

import com.naveen.dao.PaymentDao;
import com.naveen.entity.PaymentProcessInformationEntity;
import com.naveen.exceptions.PaymentException;
import com.naveen.interfaces.IPaymentDao;
import com.naveen.interfaces.IPaymentService;

public class PaymentService implements IPaymentService{

	IPaymentDao dao = new PaymentDao(); 
	
	@Override
	public PaymentProcessInformationEntity checkPayment(String name, double amount) {
		if( name.length()<3 ||  amount < 0) {
			throw new PaymentException("Sorry amount too less or name is small"); 
		}
		return dao.pay(name, amount);
	}
}
