/*
 * Parent Class (SwiggyOrder):

Attributes: orderId, customerName, cartValue

Behavior:

calculateFinalBill: Base method returning cartValue plus standard packaging fee.
 */

package com.system.zomatocheckout;

public class SwiggyOrder {

	private static double standardPackingFee;
	static {
		standardPackingFee = 40;
	}
	private String orderId;
	private String customerName;
	private double cartValue;

	public SwiggyOrder(String orderId, String customerName, double cartValue) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.cartValue = checkNegative(cartValue, "SwiggyOrder");
	}

	public double checkNegative(double value, String className) {
		if (value >= 0) {
			return value;
		} else {
			System.out.printf("[Error] found negative value at %s. Setting it to zero.", className);
			System.out.println();
			return 0.0;
		}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public double getCartValue() {
		return this.cartValue;
	}

	public double getStandardPackingFee() {
		return SwiggyOrder.standardPackingFee;
	}


	public double calculateFinalBill() {
		StringBuilder sb = new StringBuilder();
		sb.append("Customer Name: ");
		sb.append(this.getCustomerName());
		sb.append("\nOrder Id: ");
		sb.append(this.getOrderId());
		sb.append("\nAmount: ");
		sb.append(this.getCartValue());
		sb.append("\nStandard Packing Fees: ");
		sb.append(SwiggyOrder.standardPackingFee);
		System.out.println(sb.toString());
		return this.getCartValue() + SwiggyOrder.standardPackingFee;
	}
}
