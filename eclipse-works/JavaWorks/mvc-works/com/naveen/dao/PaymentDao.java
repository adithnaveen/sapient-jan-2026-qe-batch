package com.naveen.dao;

import com.naveen.entity.PaymentBean;
import com.naveen.entity.PaymentProcessInformationEntity;
import com.naveen.interfaces.IPaymentDao;

public class PaymentDao implements IPaymentDao {

	@Override
	public PaymentProcessInformationEntity pay(String name, double amount) {
		PaymentBean paymentBean = new PaymentBean(name, amount);
		return new PaymentProcessInformationEntity(paymentBean.getPaymentId()); 
	}

}
