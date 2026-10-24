package com.system.billingEngine;

/*
 * Child Class 2 (IntercityPartner extends DeliveryPartner):

Attributes: highwayTollReimbursement

Behavior: Override calculatePayout to include the toll reimbursement.
 */
public class IntercityPartner extends DeliveryPartner {

	private double highwayTollReimbursement;

	IntercityPartner(String partnerId, String partnerName, double baseDeliveryPayout, double highwayTollReimbursement) {
		super(partnerId, partnerName, baseDeliveryPayout);
		this.highwayTollReimbursement = highwayTollReimbursement;
	}

	public double getHighwayTollReimbursement() {
		return this.highwayTollReimbursement;
	}

	@Override
	public double calculatePayout() {
		
		double parent = super.calculatePayout();
		System.out.println("You will get high way reimbursement: ");
		return parent + this.getHighwayTollReimbursement();
	}
}
