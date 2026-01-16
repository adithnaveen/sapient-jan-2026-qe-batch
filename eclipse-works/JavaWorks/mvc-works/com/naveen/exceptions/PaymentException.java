package com.naveen.exceptions;

public class PaymentException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String msg; 
	
	public PaymentException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "PaymentException [msg=" + msg + "]";
	}
}
