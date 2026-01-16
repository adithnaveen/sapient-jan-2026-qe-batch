package com.naveen.entity;

public class PaymentProcessInformationEntity {
	private int transactionId; 
	
	public PaymentProcessInformationEntity(int transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "PaymentProcessInformationEntity [transactionId=" + transactionId + "]";
	}

	public int getTransactionId() {
		return transactionId;
	}
	
	
}
