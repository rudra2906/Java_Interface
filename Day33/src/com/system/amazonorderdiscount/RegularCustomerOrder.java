package com.system.amazonorderdiscount;

/*
 * order).

Child Class 1 (RegularCustomerOrder extends CustomerOrder):

Attributes: deliveryCharge
Behavior: Override processOrderDiscount to add the delivery charge to orderAmount
 (if orderAmount is less than 500) and return the final amount.
 */
public class RegularCustomerOrder extends CustomerOrder { 

	private double deliveryCharge;

	public RegularCustomerOrder(String orderId, String customerName, double orderAmount, double deliveryCharge) {
		super(orderId, customerName, orderAmount);
		this.deliveryCharge = super.checkNegative(deliveryCharge);

	}

	public double getDeliveryCharge() {
		return this.deliveryCharge;
	}

	@Override
	public double processOrderDiscount() {
		double finalAmount = super.processOrderDiscount();
		if (finalAmount >=500) {
			System.out.println("You got a free Delivery");
			System.out.println("Final Amount: " + finalAmount);
			return super.getOrderAmount();
		} else {
			System.out.println("Delivery Amount: " + this.getDeliveryCharge());
			finalAmount += this.deliveryCharge;
			System.out.println("Final Amount: "+ finalAmount);
			return finalAmount;
		}

	}

}
