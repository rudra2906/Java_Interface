/*
 * Subclass 1 — GroceryCartOrder (Extends CartOrder):

Attributes: refrigeratedBagFee, minimumFreeDeliverySlot

Behavior:

Override computeFinalBill(): Adds cold-storage packaging fees. If rawCartTotal is below minimumFreeDeliverySlot, appends a delivery surcharge.

 */

package com.system.loyaltyEngine;

public class GroceryCartOrder extends CartOrder {

	private double refrigeratedBagFee;
	private double minimumFreeDeliverySlot;

	public GroceryCartOrder(String orderId, String customerEmail, double rawCartTotal, double refrigeratedBagFee,
			int minimumFreeDeliverySlot) {
		super(orderId, customerEmail, rawCartTotal);
		this.refrigeratedBagFee = refrigeratedBagFee;
		this.minimumFreeDeliverySlot = minimumFreeDeliverySlot;
	}

	public double getRefrigeratedBagFee() {
		return refrigeratedBagFee;
	}

	public double getMinimumFreeDeliverySlot() {
		return minimumFreeDeliverySlot;
	}

	@Override
	public double finalAmount() {
		if (super.getRawCartTotal() < this.getMinimumFreeDeliverySlot()) {
			return super.finalAmount() + 30 + this.getRefrigeratedBagFee();
		} else {
			return super.finalAmount() + this.getRefrigeratedBagFee();
		}
	}

	@Override
	public String computeFinalBill() {
		String cartOrderComputeBill = super.computeFinalBill();
		StringBuilder sb = new StringBuilder();
		sb.append(cartOrderComputeBill);
		if (super.getRawCartTotal() < this.getMinimumFreeDeliverySlot()) {
			sb.append("\nDelivery Fees: ").append(30);

		} else {
			sb.append("\nDelivery Fees: ").append("You gotta Free Delivery.");

		}
		sb.append("\nRefrigerated Bag Fee: ").append(this.getRefrigeratedBagFee());
		sb.append("Minimum Free DeliverySLot: ").append(this.getMinimumFreeDeliverySlot());
		return sb.toString();
	}

}
