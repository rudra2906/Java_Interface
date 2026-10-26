package com.system.oopspractise;

public class PaymentMethod
/*
 * Parent Class (PaymentMethod): Attributes: transactionId, merchantName, amount
 * Behavior:
 * 
 * Normalize merchantName into the String Constant Pool (SCP) since thousands of
 * transactions happen for the same merchant (e.g., "Flipkart").
 * 
 * doPayment: Base method to process payment.
 */
{

	private String transactionId;
	private String merchantName;
	private double amount;

	public PaymentMethod(String transactionId, String merchantName, double amount) {
		this.transactionId = transactionId;
		this.merchantName = merchantName.intern();
		this.amount = checkNegative(amount);
	}

	private double checkNegative(double value) {
		if (value > 0) {
			return value;
		} else {
			return 0.0;
		}
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}

	public double getAmount() {
		return this.amount;
	}

	public String doPayment() {
		StringBuilder sb = new StringBuilder();
		sb.append("Transaction Id: ");
		sb.append(this.getTransactionId());
		sb.append("\nMerchant Name: ");
		sb.append(this.getMerchantName());
		sb.append("\nAmount: ");
		sb.append(this.getAmount());
		return sb.toString();
		
	}

	public void applyPromoCode(double value) 
	{
		System.out.println("Promo Code Applied!!");
		this.amount -= value; 
	}
}
