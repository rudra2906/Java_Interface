package com.system.amazonorderdiscount;

public class CustomerOrder {

	private String orderId;
	private String customerName;
	private double orderAmount;

	public CustomerOrder(String orderId, String customerName, double orderAmount) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderAmount = checkNegative(orderAmount);
	}

	protected double checkNegative(double value) {
		if (value > 0) {
			return value;
		} else {
			System.out.println("[Error] price is negative it cannot be nagative");
			return 0.0;
		}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public double getOrderAmount() {
		return this.orderAmount;
	}

	public double processOrderDiscount() {
		System.out.println("Order Id: " + this.getOrderId());
		System.out.println("Customer Name: " + this.getCustomerName());
		System.out.println("Order amount: " + this.getOrderAmount());
		return this.getOrderAmount();
	}

}
