package com.naveen.entity;

public class PaymentBean {
	private int paymentId; 
	private String paymentPersonName; 
	private double paymentAmount; 
	
	private static int paymentCounter;
	
	public PaymentBean(String paymentPersonName, double paymentAmount) {
		this.paymentId = ++ paymentCounter;
		this.paymentPersonName = paymentPersonName; 
		this.paymentAmount = paymentAmount; 
	}

	public int getPaymentId() {
		return paymentId;
	}

	public String getPaymentPersonName() {
		return paymentPersonName;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public static int getPaymentCounter() {
		return paymentCounter;
	}
	
	
	
	
}
