package com.naveen.controller;

public class PaymentApp {
	public static void main(String args[]) {
		PaymentController pc = new PaymentController();
		pc.process("Naveen", 1234);
		pc.process("Naveen", 12);
		pc.process("kumar", 1234);
		pc.process("Scott", 1234);
		pc.process("harry", 1234);
		pc.process("Tiger", 1234);
		pc.process("Peter", 1234);
		}
}
