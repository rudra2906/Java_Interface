/*
 * Attributes: telecomOperator, postpaidMobileNumber

Behavior: Implement the abstract methods (zero platform fee for utility bills, and mask the first 6 digits of postpaidMobileNumber in the debit 
confirmation using StringBuilder).
 */
package com.system.mandateengine;

public class TelecomBillMandate extends UpiMandate {

	private String telecomOperator;
	private String postPaidMobileNumber;

	public TelecomBillMandate(String mandateUmn, String payerVpa, String merchantName, double maxLimitAmount,
			String telecomOperator, String postPaidMobileNumber) {
		super(mandateUmn, payerVpa, merchantName, maxLimitAmount);
		this.telecomOperator = telecomOperator;
		this.postPaidMobileNumber = postPaidMobileNumber;
	}

	private String maskMobileNumber(String mobileNumber) {
		if (mobileNumber.length() == 10) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mobileNumber.length() - 4; i++) {
				sb.append("*");
			}
			sb.append(mobileNumber.substring(mobileNumber.length() - 4));
			return sb.toString();
		} else {
			return "Mobile number is not valid";
		}
	}

	public String getTelecomOperator() {
		return telecomOperator;
	}

	public String getPostPaidMobileNumber() {
		return maskMobileNumber(postPaidMobileNumber);
	}

	@Override
	public double calculatePlatformFee(double debitAmount) {

		return 0;
	}

	@Override
	public String executeRecurringDebit(double debitAmount) {

		StringBuilder sb = new StringBuilder();
		sb.append("\nTelecom Operator: ").append(this.telecomOperator).append("\nMobile Number: ")
				.append(this.getPostPaidMobileNumber()).append("\nDebit Amount: ").append(debitAmount);
		return sb.toString();
	}

}
