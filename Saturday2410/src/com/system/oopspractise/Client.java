package com.system.oopspractise;

public class Client {

	public static void main(String[] args) {

		RazorpayProcessor payment = new RazorpayProcessor();
		
		PaymentMethod c = new CreditCardPayment("QWS323", "FLIPKART", 150000, "87704004379388", "RUPAY");
		payment.process(c);
		
		System.out.println();
		//downcasting -- converting to its object form parent object
		CreditCardPayment creditpayment = (CreditCardPayment) c;
		System.out.println(creditpayment.doPayment());

		System.out.println();
		payment.process(new UpiPayment("TUS32", "AMAZON", 5000, "Suraj@123"));
		
		System.out.println();
		PaymentMethod p = new PaymentMethod("IER32","FLIPKART",9810);
		payment.process(p);
		
		System.out.println();
		CreditCardPayment payment01 = new CreditCardPayment("ID66", "FLIPKART", 5000, "54644656", "RUPAY");
		payment.process(payment01, "WELCOME50");
		
		System.out.println();
		System.out.println(c.getMerchantName()==p.getMerchantName());//true same object in scp
		
		
	
		
		
	}

}
