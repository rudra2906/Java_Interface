package com.system.practiseString;

/*
 * Parent Class (CreditCardAccount):

Attributes: cardHolderName, cardNumber (16 digits), cardNetwork, totalSpent

Behavior:

Ensure totalSpent cannot be negative and optimize cardNetwork in the String Constant Pool (SCP).

Core Functionality (Hidden):

maskCardNumber: Uses StringBuilder to mask the first 12 digits of cardNumber so only the last 4 digits are visible (e.g., "************4589").

calculateMinimumDue: Calculates 5% of totalSpent.

Required Functionality (Exposed):

generateMonthlyStatement: Calls the internal core steps and uses StringBuilder to build and return the formatted statement.
 */

public class CreditCardAccount {

	private String cardHolderName;
	private String cardNumber;
	private String cardNetwork;
	private double totalSpent;
	private boolean flag;

	public CreditCardAccount(String cardHolderName, String cardNumber, String cardNetwork, double totalSpent) {
		this.cardHolderName = cardHolderName;
		this.cardNumber = this.validCreditCard(cardNumber);
		this.cardNetwork = cardNetwork.intern();
		this.totalSpent = checkNegative(totalSpent);
	}

	protected double checkNegative(double value) {
		if (value > 0) {
			return value;
		} else {
			return 0.0;
		}
	}


	private String validCreditCard(String value) {
		if (value.length() == 16) {
			this.flag = true;
			return value;
		} else {
			this.flag = false;
			System.out.println("You have given invalid credit card details setting it to not valid");
			return "Not valid";
		}
	}

	public String getCardHolderName() {
		return this.cardHolderName;
	}

	public double getTotalSpent() {
		return this.totalSpent;
	}

	public String getCardNetwork() {
		return this.cardNetwork;
	}

	public String getCardNumber() {
		return this.maskCardNumber();
	}

	private String maskCardNumber() {
		StringBuilder sb = new StringBuilder();
		if (flag) {
			for (int i = 0; i < this.cardNumber.length() - 4; i++) {
				sb.append("*");
			}
			sb.append(this.cardNumber.substring(this.cardNumber.length() - 4));
			return sb.toString();
		} else {
			return "Details not found.";
		}
	}

	private double calculateMinimumDue() {
		return getTotalSpent() * 0.05;

	}

	public String generateMonthlyStatement() {
		StringBuilder sb = new StringBuilder();
		sb.append("Card Holder Name: ");
		sb.append(this.getCardHolderName());
		sb.append("\nCard Number: ");
		sb.append(this.getCardNumber());
		sb.append("\nCard Network: ");
		sb.append(this.getCardNetwork());
		sb.append("\nYour total Spent: ");
		sb.append(this.getTotalSpent());
		sb.append("\nYour Minimum Due: ");
		sb.append(this.calculateMinimumDue());

		return sb.toString();
	}
}
