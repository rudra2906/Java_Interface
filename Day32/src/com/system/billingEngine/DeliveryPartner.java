package com.system.billingEngine;

/*
 * Parent Class (DeliveryPartner):

Attributes: partnerId, partnerName, baseDeliveryPayout

Behavior: calculatePayout — returns the base payout and prints partner details.
 */
public class DeliveryPartner {

	private String partnerId;
	private String partnerName;
	private double baseDeliveryPayout;

	public DeliveryPartner(String partnerId, String partnerName, double baseDeliveryPayout) {
		this.partnerId = partnerId;
		this.partnerName = partnerName;
		this.baseDeliveryPayout = baseDeliveryPayout;
	}

	public String getPartnerId() {
		return this.partnerId;
	}

	public String getPartnerName() {
		return this.partnerName;
	}

	public double getBaseDeliveryPayout() {
		return this.baseDeliveryPayout;
	}

	double calculatePayout() {
		System.out.println("Partner Name: " + this.getPartnerName());
		System.out.println("Partner Id:" + this.getPartnerId());
		System.out.println("Base Payout: " + this.getBaseDeliveryPayout());
		return this.baseDeliveryPayout;
	}

}
