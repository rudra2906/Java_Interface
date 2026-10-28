/*
 * Attributes: folioNumber, amcName, stampDutyPercentage (e.g., 0.005%)

Behavior: Implement the abstract methods (calculate stamp duty as the platform fee and deduct total amount).
 */
package com.system.mandateengine;

public class MutualFundSipMandate extends UpiMandate {

	private String folioNumber;
	private String amcName;
	private double stampDutyPercentage;
	public MutualFundSipMandate(String mandateUmn, String payerVpa, String merchantName, double maxLimitAmount, String folioNumber, String amcName, double stampDutyPercentage ) {
		super(mandateUmn, payerVpa, merchantName, maxLimitAmount);
		this.folioNumber = folioNumber;
		this.amcName = amcName;
		this.stampDutyPercentage = validationDutyPercentage(stampDutyPercentage);
	}
	
	private double validationDutyPercentage(double value) {
		if (value > 0 && value<=100) {
			return value;
		} else {
			System.out.println("[Error] value is negative.");
			return 0;
		}
	}

	public String getFolioNumber() {
		return folioNumber;
	}

	public String getAmcName() {
		return amcName;
	}

	public double getStampDutyPercentage() {
		return stampDutyPercentage;
	}

	@Override
	public double calculatePlatformFee(double debitAmount) {
		double deduction = debitAmount * (this.stampDutyPercentage/100);
		return debitAmount - deduction;
	}
	@Override
	public String executeRecurringDebit(double debitAmount) {
		StringBuilder sb = new StringBuilder();
		sb.append("\nFolio Number: ");
		sb.append(this.folioNumber);
		sb.append("\nAMC Number: ");
		sb.append(this.amcName);
		sb.append("\nStamp Duty Percentage: ");
		sb.append(this.stampDutyPercentage);
		return sb.toString();
	}
	
}
