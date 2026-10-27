/*
 * Base Class — CartOrder:

Attributes: orderId, customerEmail, rawCartTotal

Behavior:

Validation ensuring rawCartTotal is non-negative.

computeFinalBill(): Returns rawCartTotal plus a standard platform packaging fee.

 */
package com.system.loyaltyEngine;

public class CartOrder {

	private String orderId;
	private String customerEmail;
	private double rawCartTotal;

	private static double packagingFee;

	static {
		packagingFee = 30;
	}

	public CartOrder(String orderId, String customerEmail, double rawCartTotal) {
		this.orderId = orderId;
		this.customerEmail = validationCustomerEmail(customerEmail);
		this.rawCartTotal = this.checkNegative(rawCartTotal, "CartOrder");
	}

	private double checkNegative(double value, String className) {
		if (value >= 0) {
			return value;
		} else {
			System.out.println("[Error] value is negative, setting value to zero");
			return 0;
		}
	}

	private String validationCustomerEmail(String value) {
		if (value.contains("@")) {
			return value;
		} else {
			System.out.println("It is not valid mail id");
			return "Not valid mail";
		}
	}

	public String getOrderId() {
		return orderId;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public double getRawCartTotal() {
		return rawCartTotal;
	}

	public double finalAmount() {
		return this.getRawCartTotal() + CartOrder.packagingFee;
	}

	public String computeFinalBill() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Id: ").append(this.getOrderId());
		sb.append("\nCustomer Email Id: ").append(this.getCustomerEmail());
		sb.append("\nPackaging Fee: ").append(CartOrder.packagingFee);
		sb.append("\nRaw Cart Total: ").append(this.getRawCartTotal());
		

		return sb.toString();
	}

}
