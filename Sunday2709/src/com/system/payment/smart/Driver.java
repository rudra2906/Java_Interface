package com.system.payment.smart;

public class Driver {

	public static void main(String[] args) {
	
		CreditCardPayment user1 = new CreditCardPayment("Rudransh");
		user1.makePayment(50);
		
		
		System.out.println("**********************************************");
		CreditCardPayment user2 = new CreditCardPayment("Rudy");
		user2.makePayment(500);
		
		
	}

}
