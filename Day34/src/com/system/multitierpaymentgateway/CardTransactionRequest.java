/*
 * 
Child Class — CardTransactionRequest (Extends TransactionRequest):

Attributes: cardNumber, cardNetwork, cvv

Core Functionality (Hidden / Private):

maskCardNumber(): Uses StringBuilder to mask all but the last 4 digits (e.g., "************3421").

verifyCvv(): Validates that the CVV is either 3 or 4 digits.

calculateMdrFee(): Calculates a 1.75% Merchant Discount Rate on amount.

Required Overriding:

Override processPayment() to execute the hidden steps in order and return a new CardPaymentReceipt.

Override getReceiptDetails() using a Covariant Return Type (declaring the return type specifically as CardPaymentReceipt instead of PaymentReceipt).

Rail-Specific Diagnostic (Not in Parent):

trigger3dSecureChallenge(): Simulates OTP/Biometric secondary authentication.
 */

package com.system.multitierpaymentgateway;

public class CardTransactionRequest extends TransactionRequest {

	private String cardNumber;
	private String cardNetwok;
	private String cvv;

	public CardTransactionRequest(String transactionId, String merchantName, double amount, String currency,
			String cardNumber, String cardNetwork,String cvv) {
		super(transactionId, merchantName, amount, currency);
		this.cardNumber = checkValidCard(cardNumber);
		this.cardNetwok = cardNetwork;
		this.cvv = validateCvv(cvv);

	}
	

	public String getCardNumber() {
		return this.maskCardNumber();
	}


	public String getCardNetwok() {
		return cardNetwok;
	}


	private String checkValidCard(String cardNumber) {
		if (cardNumber.length() == 16) {
			return cardNumber;
		} else {
			System.out.println("[Error] Your card is not valid.");
			return "Unknown";
		}
	}

	private String validateCvv(String cvv) {
		if (this.cvv.length() >= 3 && this.cvv.length() < 5) {
			return cvv;
		} else {
			System.out.println("[Error] cvv is not valid");
			return "Not valid";
		}
	}

	private String maskCardNumber() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.cardNumber.length() - 4; i++) {
			sb.append("*");
		}
		sb.append(cardNumber.substring(cardNumber.length() - 4));
		return sb.toString();
	}

	private double calculateMdrFee() 
	{
		return (super.getAmount() * (1.75/100));
	}


	@Override
	public PaymentReceipt processPayment() {
		
		//CardPaymentReceipt(String receiptId, String status, double finalAmount, String authCode,String cardNetwork) 
		return new CardPaymentReceipt(cardNetwok, "SUCCESS", getAmount(), cardNumber, cardNetwok);
	}


	@Override
	public PaymentReceipt getReceiptDetails() {
		// TODO Auto-generated method stub
		return super.getReceiptDetails();
	}
	
}
