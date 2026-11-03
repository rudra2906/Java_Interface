package com.system.ecommerce;

import java.io.Serializable;

public class CustomerOrder implements Serializable {

	//private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = 29L;

	private String orderId;
	private String customerEmail;
	private double orderTotal;

	public CustomerOrder(String orderId, String customerEmail, double orderTotal) {
		this.orderId = orderId;
		this.customerEmail = customerEmail;
		this.orderTotal = orderTotal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public String printCustomerOrder() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Id: ").append(orderId).append("\nCustomer Email: ").append(customerEmail)
				.append("\nOrder total: ").append(orderTotal);
		return sb.toString();
	}

}
