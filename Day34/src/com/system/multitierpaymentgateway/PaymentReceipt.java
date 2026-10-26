/*
 * Base Return Type — PaymentReceipt:

Attributes: receiptId, status, finalAmount

Behavior: Method to generate a summary string of the receipt.
 */
package com.system.multitierpaymentgateway;

public class PaymentReceipt {
	
	private String receiptId;
	private String status;
	private double finalAmount;
	public PaymentReceipt(String receiptId, String status, double finalAmount) {
		this.receiptId = receiptId;
		this.status = status;
		this.finalAmount = checkNegative(finalAmount);
	}
	private double checkNegative(double value) 
	{
		if( value>0 ) 
		{
			return value;
		}
		else 
		{
			return 0;
		}
	}
	public String getReceiptId() {
		return receiptId;
	}
	public String getStatus() {
		return status;
	}
	public double getFinalAmount() {
		return finalAmount;
	}
	public String generateReceiptSummary() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Receipt Id: ");
		sb.append(this.getReceiptId());
		sb.append("\nStatus: ");
		sb.append(this.getStatus());
		sb.append("\nFinal Amount: ");
		sb.append(this.getFinalAmount());
		return sb.toString();
	}

}
