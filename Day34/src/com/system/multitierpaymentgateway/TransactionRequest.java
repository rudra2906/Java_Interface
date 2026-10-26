/*
 * Base Class — TransactionRequest:

Attributes: transactionId, merchantName, amount, currency

Behavior:

Validate that amount is strictly greater than zero and normalize merchantName in the SCP.

Exposed Gateway: processPayment() — returns a base PaymentReceipt reference containing base transaction info built using StringBuilder.

Covariant Method Hook: getReceiptDetails() — return type declared as PaymentReceipt.
 */
package com.system.multitierpaymentgateway;

public class TransactionRequest {

	private String transactionId;
	private String merchantName;
	private double amount;
	private String currency;

	public TransactionRequest(String transactionId, String merchantName, double amount, String currency) {
		this.transactionId = transactionId;
		this.merchantName = merchantName.intern();
		this.amount = checkNegative(amount);
		this.currency = currency.intern();
	}

	private double checkNegative(double value) {
		if (value > 0) {
			return value;
		} else {
			System.out.println("[Error] value is negative - setting value to zero");
			return 0;
		}

	}

	public String getTransactionId() {
		return transactionId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public double getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	public PaymentReceipt processPayment() {
		StringBuilder sb = new StringBuilder();
		sb.append("Transaction ID: ");
		sb.append(this.transactionId);
		sb.append(" | Merchant: ");
		sb.append(this.merchantName);
		sb.append(" | Currency: ");
		sb.append(this.currency);
		return this.getReceiptDetails();
	}

	public PaymentReceipt getReceiptDetails() {
		PaymentReceipt receiptDetails = new PaymentReceipt(transactionId, "SUCCESS", amount);
		return receiptDetails;
	}
}
