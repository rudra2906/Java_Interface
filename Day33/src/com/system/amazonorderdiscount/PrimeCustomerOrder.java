package com.system.amazonorderdiscount;

/*
 * Child Class 2 (PrimeCustomerOrder extends CustomerOrder):

Attributes: primeCashbackPercentage


Behavior: Override processOrderDiscount to deduct the cashback percentage 
from orderAmount (free delivery) and return the final amount.
 */
public class PrimeCustomerOrder extends CustomerOrder {

	private double primeCashbackPercentage;

	public PrimeCustomerOrder(String orderId, String customerName, double orderAmount, double primeCashbackPercentage) {
		super(orderId, customerName, orderAmount);
		this.primeCashbackPercentage = super.checkNegative(primeCashbackPercentage);
	}

	@Override
	public double processOrderDiscount() {
		if (this.primeCashbackPercentage <= super.getOrderAmount()) {
			double finalAmount = super.processOrderDiscount();
			finalAmount -= this.primeCashbackPercentage;
			System.out.println("Final Amount: " + finalAmount);
			return finalAmount;
		} else {
			System.out.println("Prime cash back is not applicable in this order.");
			return super.getOrderAmount();
		}
	}

}
