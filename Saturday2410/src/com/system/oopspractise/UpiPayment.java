package com.system.oopspractise;

/*
 * Child Class 2 (UpiPayment extends PaymentMethod):

Attributes: upiId

Behavior (Abstraction + Overriding):

Abstraction: Create a private core helper method validateVpaAddress() (checks if upiId contains "@").

Overriding: Override doPayment() to call validateVpaAddress() first; if valid, 
process the zero-fee UPI payment
 */
public class UpiPayment extends PaymentMethod {

	private String upiId;

	public UpiPayment(String transactionId, String merchantName, double amount, String upiId) {
		super(transactionId, merchantName, amount);
		this.upiId = upiId;
	}

	public String getUpiId() {
		return this.upiId;
	}

	private boolean validateVpaAddress() {
		if (this.getUpiId().contains("@")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String doPayment() {
		if (this.validateVpaAddress()) {
			StringBuilder sb = new StringBuilder();
			sb.append(super.doPayment());
			sb.append("\nzero-fee UPI payment");
			sb.append("\nFinal Amount: " + super.getAmount());
			return sb.toString();
		} else {
			return "Your UPI id is not valid.";
		}
	}
}
