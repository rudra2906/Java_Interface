/*
 * Abstract Base Class (UpiMandate):

Attributes: mandateUmn (Unique Mandate Number), payerVpa, merchantName, maxLimitAmount

Behavior:

Pool merchantName in the String Constant Pool (SCP) and ensure maxLimitAmount is non-negative.

Concrete Core Helper: validateVpaFormat — verifies that payerVpa contains "@".

Abstract Contracts (No Body):

calculatePlatformFee — takes the debit amount and returns the fee.

executeRecurringDebit — takes the debit amount and processes the deduction.

Exposed Gateway (Concrete): triggerAutoDebit — takes the debit amount, checks validateVpaFormat, ensures the debit amount does not exceed maxLimitAmount, 
and calls the abstract methods to print a formatted mandate receipt using StringBuilder.
 */

package com.system.mandateengine;

abstract public class UpiMandate {

	// attributes
	private String mandateUmn;
	private String payerVpa;
	private String merchantName;
	private double maxLimitAmount;

	public UpiMandate(String mandateUmn, String payerVpa, String merchantName, double maxLimitAmount) {
		this.mandateUmn = mandateUmn;
		this.payerVpa = payerVpa;
		this.merchantName = merchantName.intern();
		this.maxLimitAmount = checkNegative(maxLimitAmount);
	}

	private double checkNegative(double value) {
		if (value > 0) {
			return value;
		} else {
			System.out.println("[Error] value is negative.");
			return 0;
		}
	}

	private boolean validateVpaFormat() {
		if (this.getPayerVpa().contains("@")) {
			return true;
		} else {
			System.out.println("[Error] value is not correct.");
			return false;
		}
	}

	public String getMandateUmn() {
		return mandateUmn;
	}

	public String getPayerVpa() {
		return payerVpa;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public double getMaxLimitAmount() {
		return maxLimitAmount;
	}

	abstract public double calculatePlatformFee(double debitAmount);

	abstract public String executeRecurringDebit(double debitAmount);

	// Exposed Gateway (Concrete): triggerAutoDebit — takes the debit amount, checks
	// validateVpaFormat, ensures the debit amount does not exceed maxLimitAmount,
	// and calls the abstract methods to print a formatted mandate receipt using
	// StringBuilder.
	public String triggerAutoDebit(double debitAmount) {
		if (this.validateVpaFormat()) 
		{
			if (this.getMaxLimitAmount() > 0 && debitAmount > 0 && this.getMaxLimitAmount() >= debitAmount) 
			{
				double calculatePlatformFee = this.calculatePlatformFee(debitAmount);
				String executeRecurringDebit = this.executeRecurringDebit(debitAmount);
				
				StringBuilder sb = new StringBuilder();

				sb.append("--- UPI Mandate Auto-Debit Receipt ---").append("\nUMN: ").append(this.getMandateUmn())
						.append("\nPayer VPA: ").append(this.payerVpa).append("\nMerchant Name: ")
						.append(this.merchantName).append("\nMaximum limit amount: ").append(this.getMaxLimitAmount())
						.append("\nPlatform Fees: ").append(calculatePlatformFee)
						.append(executeRecurringDebit);

				return sb.toString();
			}
			return "Incorrect value";
		} 
		else 
		{
			return "Vpa is invalid";
		}
	}
}

/*
 * abstraction- hiding the core functionality and exposing the required
 * functionality is know as abstraction it can be achieved by using the access
 * modifiers the two levels of abstraction abstract class -> It is a class which
 * tell what can be done with partially how it can be done abstact classes which
 * can not be instanciated(can not create object)
 * 
 */
