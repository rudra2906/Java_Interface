/*
 * 
Extend the abstract base class and implement the brokerage calculation (e.g., Intraday charges 0.03% capped at ₹20; 
Delivery charges ₹0 brokerage).
Calculate 0.03% of the total turnover turnover = quantity * price.
If the calculated fee is less than ₹20, charge that 
calculated fee.If the calculated fee is greater than ₹20, stop (cap) it at ₹20.
 */
package com.system.settlementengine;

public class IntradayEquityOrder extends ExchangeOrder {
	
	IntradayEquityOrder(String orderId, String stockTicker, double quantity, double pricePerShare) {
		super(orderId, stockTicker, quantity, pricePerShare);
	}

	@Override
	public double calculateBrokerage() {

		double totalTurnOver = super.getQuantity() * super.getPricePerShare();
		double totalTurnOverPercentage = (totalTurnOver * 0.03);
		if (totalTurnOverPercentage < 20) {
			return totalTurnOverPercentage;
		} else {
			return 20.0;
		}
	}
}
