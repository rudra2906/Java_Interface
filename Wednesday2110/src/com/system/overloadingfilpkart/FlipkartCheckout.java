package com.system.overloadingfilpkart;

public class FlipkartCheckout {

	private String orderId;
	private double cartTotal;

	public FlipkartCheckout(String orderId, double cartTotal) {
		this.orderId = orderId;
		this.cartTotal = checkNegative(cartTotal);
	}

	public String getOrderId() {
		return this.orderId;
	}

	public double getCartTotal() {
		return this.cartTotal;
	}

	private double checkNegative(double value) {
		if (value > 0) {
			return value;
		} else {

			System.out.println("[Error] Value is negative. check the value");
			return 0.0;
		}
	}

	public void upiPayment() {

	}

}
//what is method overloading 
/*
 * method overloading is when we get a multiple functionaliy of a method within
 * a class is called method overloading
 * 
 * there is no such rule of overloading it is also known as run time
 * polymorphisms either data type of parameter should be change either order or
 * parameter
 * 
 * to overload method every method should have different signature
 */