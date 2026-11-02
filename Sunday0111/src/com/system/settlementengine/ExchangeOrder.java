/*
 * 
SIB: Initialize a static exchange code (e.g., "NSE_EQ").

IIB: Set default order status to "PENDING_VALIDATION".

Attributes: Order ID, stock ticker (pool in SCP via .intern()), quantity, price per share.

Object.equals(Object obj) Override: Safely downcast Object to check if two orders have the same Order ID and stock ticker.

 */
package com.system.settlementengine;

abstract class ExchangeOrder implements ISettelment{

	{
		status = "PENDING_VALIDATION";
	}
	static {
		exchangeCode = "NSE_EQ";
	}
	private static String exchangeCode;
	private String orderId;
	private String stockTicker;
	private double quantity;
	private double pricePerShare;
	private String status;
	
	public ExchangeOrder(String orderId, String stockTicker, double quantity, double pricePerShare) {
		this.orderId = orderId;
		this.stockTicker = stockTicker.intern();
		this.quantity = quantity;
		this.pricePerShare = pricePerShare;
	}
	
	public static String getExchangeCode() {
		return exchangeCode;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getStockTicker() {
		return stockTicker;
	}

	public double getQuantity() {
		return quantity;
	}

	public double getPricePerShare() {
		return pricePerShare;
	}

	public String getStatus() {
		return status;
	}


	
	@Override
	public boolean equals(Object obj) 
	{
		if( obj==null) 
		{
			return false;
		}
	
		ExchangeOrder order = (ExchangeOrder)obj;
		//orderid
		//stock ticker two orders have the same Order ID and stock ticker.
		return ( this.orderId.equals(order.orderId)  && this.stockTicker == order.stockTicker );
		
		
	}
	
}
