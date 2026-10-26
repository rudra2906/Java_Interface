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

	protected void processPayment(String upiId, String upiPin) {
		if (upiId.contains("@") && upiPin != null) {
			System.out.println("Your " + this.cartTotal + " pament is in progress.");
		} else {
			System.out.println("Please enter the correct upi id");
		}
	}

	// version --> card payment
	public String processPayment(String cardNumber, int cvv, int otp) {
		StringBuilder sb = new StringBuilder();
		sb.append("CardNumber: ");
		if (cardNumber != null && cardNumber.length() > 4) {
			for (int i = 0; i < cardNumber.length() - 4; i++) {
				sb.append("*");
			}
			sb.append(cardNumber.substring(cardNumber.length() - 4));
		}

		this.cartTotal += (1.5 / 100);
		sb.append("\nYour ");
		sb.append(this.cartTotal);
		sb.append(" payment is in progress");

		return sb.toString();

	}

	double processPayment(int deiveryPincode, double cashHandlingFee) {
		System.out.println("CashHandling fees: " + cashHandlingFee);
		this.cartTotal += cashHandlingFee;
		return this.cartTotal;
	}

}
//what is method overloading 
/*
 * Class (FlipkartCheckout):
 * 
 * Attributes: orderId, cartTotal (Choose data types & encapsulate).
 * 
 * Overloaded Methods (processPayment):
 * 
 * Version 1 (UPI Payment): Accepts upiId and upiPin. Validates that upiId
 * contains "@" and processes the payment.
 * 
 * Version 2 (Card Payment): Accepts cardNumber, cvv, and otp. Masks the card
 * number using StringBuilder so only the last 4 digits are visible and adds a
 * 1.5% card processing fee to cartTotal.
 * 
 * Version 3 (Cash on Delivery): Accepts deliveryPincode and cashHandlingFee.
 * Adds the flat cashHandlingFee to cartTotal and returns the final payable
 * amount.
 * 
 * 
 * 
 * method overloading is when we get a multiple functionaliy of a method within
 * a class is called method overloading
 * 
 * there is no such rule of overloading it is also known as run time
 * polymorphisms either data type of parameter should be change either order or
 * parameter
 * 
 * to overload method every method should have different signature
 */