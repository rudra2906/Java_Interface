/*
 * Two Concrete Subclasses (Intraday Equity Order & Delivery Equity Order):

Extend the abstract base class and implement the brokerage calculation (e.g., Intraday charges 0.03% capped at ₹20; 
Delivery charges ₹0 brokerage).
 */
package com.system.settlementengine;

public class DeliveryEquityOrder extends ExchangeOrder{

	public DeliveryEquityOrder(String orderId, String stockTicker, double quantity, double pricePerShare)
	{
		super(orderId, stockTicker, quantity, pricePerShare);
	}

	@Override
	public double calculateBrokerage() {
		return 0;
		
	}
	
}
