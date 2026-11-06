package com.system.orderrecreation;

public class OrderBasket implements Cloneable {

	private String orderId;
	private double amount;
	private DeliverySlot deliverySlot;

	public OrderBasket(String orderId, double amount, DeliverySlot deliverySlot) {
		this.orderId = orderId;
		this.amount = amount;
		this.deliverySlot = deliverySlot;
	}

	public String getOrderId() {
		return orderId;
	}

	public double amount() {
		return amount;
	}

	public DeliverySlot getDeliverySlot() {
		return deliverySlot;
	}

	@Override
	public OrderBasket clone() throws CloneNotSupportedException {
		OrderBasket order = (OrderBasket) super.clone();
		order.deliverySlot = (DeliverySlot) deliverySlot.clone();
		return order;
	}
}
