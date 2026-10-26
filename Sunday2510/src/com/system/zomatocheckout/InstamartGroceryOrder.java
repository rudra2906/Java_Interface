/*
 * Child Class 1 (InstamartGroceryOrder extends SwiggyOrder):

Attributes: handlingCharge, freeDeliveryThreshold

Behavior:

Override calculateFinalBill: Adds handlingCharge, plus a ₹40 delivery fee only if cartValue is below freeDeliveryThreshold.
 */
package com.system.zomatocheckout;

public class InstamartGroceryOrder extends SwiggyOrder {

	private double handlingCharge;
	private double freeDeliveryThreshold;

	public InstamartGroceryOrder(String orderId, String customerName, double cartValue, double handlingCharge,
			double freeDeliveryThreshold) {
		super(orderId, customerName, cartValue);
		this.handlingCharge = super.checkNegative(handlingCharge, "InstamartGroceryOrder");
		this.freeDeliveryThreshold = super.checkNegative(freeDeliveryThreshold, "InstamartGroceryOrder");
	}

	public double getFreeDeliveryThreshold() {
		return this.freeDeliveryThreshold;
	}

	public double getHandlingCharge() {
		return this.handlingCharge;
	}

	@Override
	public double calculateFinalBill() {
		double finalAmount = super.calculateFinalBill();
		StringBuilder sb = new StringBuilder();
		sb.append("\nHandling Charge: ");
		sb.append(this.getHandlingCharge());
		sb.append("\nDelivery Fees: ");
		if (freeDeliveryThreshold <= super.getCartValue()) {
			sb.append("Congratulation!!! you gotta free delivery....");
			finalAmount += this.getHandlingCharge();
		} else {
			sb.append("40 rupees Only");
			finalAmount += this.getHandlingCharge() + 40;
		}
		System.out.println(sb.toString());
		return finalAmount;
	}

}