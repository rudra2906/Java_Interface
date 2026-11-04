package com.system.tradingplatform;

public class Trade {

	private String stockTicker;
	private double tradedQuantity;
	private double executionPrice;
	public Trade(String stockTicker, double tradedQuantity, double executionPrice) {
		this.stockTicker = stockTicker;
		this.tradedQuantity = tradedQuantity;
		this.executionPrice = executionPrice;
	}
	public String getStockTicker() {
		return stockTicker;
	}
	public double getTradedQuantity() {
		return tradedQuantity;
	}
	public double getExecutionPrice() {
		return executionPrice;
	}
	
}
