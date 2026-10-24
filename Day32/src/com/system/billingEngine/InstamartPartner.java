package com.system.billingEngine;

/*
 * Child Class 1 (InstamartPartner extends DeliveryPartner):

Attributes: heavyBagAllowance

Behavior:

Override calculatePayout to include the heavy bag allowance.

Add a child-specific method claimRainSurgeBonus that is not present in DeliveryPartner.
 */
public class InstamartPartner extends DeliveryPartner {

	private double heavyBagAllowance;

	InstamartPartner(String partnerId, String partnerName, double baseDeliveryPayout, double heavyBagAllowance) {
		super(partnerId, partnerName, baseDeliveryPayout);
		this.heavyBagAllowance = heavyBagAllowance;
	}

	public double getHeavyBagAllowance() {
		return this.heavyBagAllowance;
	}

	@Override
	public double calculatePayout() {
		double parent = super.calculatePayout();
		System.out.println("Heavy Bag Allowance: " + this.getHeavyBagAllowance());
		return this.getHeavyBagAllowance() + parent;

	}

	public double claimRainSurgeBonus(double value) {
		if (value < 1000 && value >= 0) {
			System.out.println("You got a claim of Rain bonus: " + value);
			return value;
		} else {
			System.out.println("You got a claim of rain bonus: " + 1000.0);
			return 1000.0;
		}
	}

}
