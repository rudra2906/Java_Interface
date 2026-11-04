package com.system.addressmutation;

public class SwiggyOrder implements Cloneable {

	private String orderId;
	private String resturantName;
	private Address deliveryAddress;

	public SwiggyOrder(String orderId, String resturantName, Address deliveryAddress) {
		this.orderId = orderId;
		this.resturantName = resturantName;
		this.deliveryAddress = deliveryAddress;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getResturantName() {
		return resturantName;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}

	public void setAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// deep cloning
		SwiggyOrder order = (SwiggyOrder) super.clone();
		order.deliveryAddress = (Address) deliveryAddress.clone();
		return order;
	}

}
