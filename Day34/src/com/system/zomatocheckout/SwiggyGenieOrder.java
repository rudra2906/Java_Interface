/*
Child Class 2 (SwiggyGenieOrder extends SwiggyOrder):
Attributes: distanceKm, perKmRate
Behavior:
Override calculateFinalBill: Adds distanceKm * perKmRate to the base bill.
 */
package com.system.zomatocheckout;

public class SwiggyGenieOrder extends SwiggyOrder {

	private double distanceKm;
	private double perKmRate;

	public SwiggyGenieOrder(String orderId, String customerName, double cartValue, double distanceKm,
			double perKmRate) {
		super(orderId, customerName, cartValue);
		this.distanceKm = super.checkNegative(distanceKm, "SwiggyGenieOrder");
		this.perKmRate = super.checkNegative(perKmRate, "SwiggyGenieOrder");
	}

	public double getDistanceKm() {
		return distanceKm;
	}

	public double getPerKmRate() {
		return perKmRate;
	}

	@Override
	public double calculateFinalBill() {
		double finalResult = super.calculateFinalBill();
		StringBuilder sb = new StringBuilder();
		sb.append("\nDelivery Fees: ");
		sb.append(distanceKm * perKmRate);
		System.out.println(sb.toString());
		finalResult += this.getDistanceKm() * this.getPerKmRate();
		return finalResult;
	}

}
