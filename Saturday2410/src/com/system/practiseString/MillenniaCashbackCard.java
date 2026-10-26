package com.system.practiseString;

/*
 * Child Class (MillenniaCashbackCard extends CreditCardAccount):

Attributes: cashbackPercentage, annualFeeWaiverLimit

Behavior:

Core Functionality (Hidden):

calculateCashbackEarned: Calculates cashback based on totalSpent and cashbackPercentage.

checkAnnualFeeWaiver: Checks if totalSpent crosses annualFeeWaiverLimit.

Required Functionality (generateMonthlyStatement):

Override the parent method to include the parent statement details along with the earned cashback and fee waiver status.
 */
public class MillenniaCashbackCard extends CreditCardAccount {

	private double cashBackPercentage;
	private double annualFeeWaiverLimit;

	public MillenniaCashbackCard(String cardHolderName, String cardNumber, String cardNetwork, double totalSpent,
			double cashBackPercentage, double annualFeeWaiverLimit) {
		super(cardHolderName, cardNumber, cardNetwork, totalSpent);
		this.cashBackPercentage = super.checkNegative(cashBackPercentage);
		this.annualFeeWaiverLimit = super.checkNegative(annualFeeWaiverLimit);

	}


	public double getCashBackPercentage() {
		return this.cashBackPercentage;
	}

	public double getAnnualFeeWaiverLimit() {
		return this.annualFeeWaiverLimit;
	}

	private double calculateCashbackEarned() {
		// Calculates cashback based on totalSpent and cashbackPercentage.
		return super.getTotalSpent() * (this.getCashBackPercentage() / 100);
	}

	private boolean checkAnnualFeeWaiver() {
		if (super.getTotalSpent() >= this.getAnnualFeeWaiverLimit()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String generateMonthlyStatement() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.generateMonthlyStatement());
		sb.append("\nTotal Cash Back Earned: ");
		sb.append(this.calculateCashbackEarned());
		sb.append("\nAnnual Fee Waiver: ");
		if (this.checkAnnualFeeWaiver()) {
			sb.append("Congratulation there is no fee for you.");
		} else {
			sb.append("There will be a standard fee of: 1000 only.");
		}

		return sb.toString();
	}

}
