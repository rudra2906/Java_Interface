package com.system.SOLIDprinciple;

public class Driver {

	public static void main(String[] args) {
		
		PaymentProcessor payment = new PaymentProcessor();
		
		
		payment.process(new UpiPayment("Rudy","rudy29@icic"));
		
		payment.process(new CardPayment("Rudy", "8770400437"));
		
		
	}
}
