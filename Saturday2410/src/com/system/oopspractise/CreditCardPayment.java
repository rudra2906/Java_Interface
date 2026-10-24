package com.system.oopspractise;

/*
 * Child Class 1 (CreditCardPayment extends PaymentMethod):

Attributes: cardNumber, cardNetwork (e.g., "VISA", "RUPAY")

Behavior (Abstraction + Overriding):

Abstraction: Create private core helper methods maskCardNumber() 
(using StringBuilder so only the last 4 digits are visible) and  deductMDRFee() 
(adds a 2% Merchant Discount Rate fee).

Overriding: Override doPayment() (public) so it internally calls the private helper methods 
and prints the masked card receipt.
 */
public class CreditCardPayment extends PaymentMethod {

	private String cardNumber;
	private String cardNetwork;

	public CreditCardPayment(String transactionId, String merchantName, double amount, String cardNumber,
			String cardNetwork) {
		super(transactionId, merchantName, amount);
		this.cardNumber = cardNumber;
		this.cardNetwork = cardNetwork.intern();
	}

	public String getCardNumber() {
		return this.maskCardNumber();
	}

	public String getCardNetwork() {
		return this.cardNetwork;
	}

	private String maskCardNumber() {
		StringBuilder sb = new StringBuilder();
		if (this.cardNumber.length() > 4) {
			for (int i = 0; i < this.cardNumber.length() - 4; i++) {
				sb.append("*");
			}
			sb.append(this.cardNumber.substring(this.cardNumber.length() - 4));
		}
		return sb.toString();
	}

	private double deductMDRFee() {
		double finalAmount = super.getAmount();
		finalAmount = finalAmount + (finalAmount * 0.02);
		return finalAmount;
	}

	@Override
	public String doPayment() {
		StringBuilder finalResult = new StringBuilder();
		finalResult.append(super.doPayment());
		finalResult.append("\nCard Number: ");
		finalResult.append(this.getCardNumber());
		finalResult.append("\nCard Network: ");
		finalResult.append(this.getCardNetwork());
		finalResult.append("\nFinal Payment: ");
		finalResult.append(this.deductMDRFee());

		return finalResult.toString();
	}

}
