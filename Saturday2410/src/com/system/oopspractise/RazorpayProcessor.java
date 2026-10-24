package com.system.oopspractise;
/*
 * Processor Class (RazorpayProcessor):

Behavior (Method Overloading + Runtime Polymorphism):

Overload 1: process(PaymentMethod payment) — accepts any PaymentMethod child object 
and calls doPayment() polymorphically.

Overload 2: process(PaymentMethod payment, String promoCode) — applies a flat promo discount 
if promoCode matches "WELCOME50" and then calls doPayment() polymorphically.
 */
public class RazorpayProcessor {

	public void process( PaymentMethod payment ) 
	{
		System.out.println(payment.doPayment());;
	}
	public void process( PaymentMethod payment,String promoCode ) 
	{
		if( promoCode.equalsIgnoreCase("WELCOME50")) 
		{
			payment.applyPromoCode(50);
			System.out.println(payment.doPayment());
		}
		else 
		{
			System.out.println("PromoCode didnt match!!");
		}
	}
	
}
