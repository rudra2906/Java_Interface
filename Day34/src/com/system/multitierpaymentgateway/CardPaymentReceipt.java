/*
 * 
Specialized Return Type — CardPaymentReceipt (Extends PaymentReceipt):

Attributes: authCode, cardNetwork

Behavior: Overrides receipt summary to append the authorization code and network.
 */
package com.system.multitierpaymentgateway;

public class CardPaymentReceipt extends PaymentReceipt {

	private String authCode;
	private String cardNetwork;

	public CardPaymentReceipt(String receiptId, String status, double finalAmount, String authCode,
			String cardNetwork) {
		super(receiptId, status, finalAmount);
		this.authCode = validAuthCode(authCode);
		this.cardNetwork = cardNetwork.intern();
	}

	private String validAuthCode(String value) {
		if (value != null && value.length() >= 4) {
			return value;
		} else {
			System.out.println("[Error] check authorization code.");
			return "Unknown";
		}
	}

	public String getAuthCode() {
		return authCode;
	}

	public String getCardNetwork() {
		return cardNetwork;
	}

	@Override
	public String generateReceiptSummary() {
		String parent = super.generateReceiptSummary();
		StringBuilder sb = new StringBuilder();
		sb.append(parent);
		sb.append("\nAuthorization Code: ");
		sb.append(this.getAuthCode());
		sb.append("\nCard Network: ");
		sb.append(this.getCardNetwork());
		return sb.toString();
	}

}
