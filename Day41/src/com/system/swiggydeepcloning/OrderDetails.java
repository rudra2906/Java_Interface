package com.system.swiggydeepcloning;

public class OrderDetails implements Cloneable {

	private String orderQuantity;
	private double orderAmount;
	private String couponCode;

	public OrderDetails(String orderQuantity, double orderAmount, String couponCode) {
		this.orderQuantity = orderQuantity;
		this.orderAmount = orderAmount;
		this.couponCode = couponCode;
	}

	public String getOrderQuantity() {
		return orderQuantity;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setOrderQuantity(String orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
