package com.system.orderrecreation;

public class DeliverySlot implements Cloneable {

	private String deliveryDate;
	private String timeSlot;

	public DeliverySlot(String deliveryDate, String timeSlot) {
		this.deliveryDate = deliveryDate;
		this.timeSlot = timeSlot;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setDeliveryDate(String value) {
		this.deliveryDate = value;
	}

	public void setTimeSlot(String value) {
		this.timeSlot = value;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
