package com.system.custommarker;

public class RetailPortfolio implements ICloud{

	private String clientId;
	private String stockSymbol;
	private int value;
	public RetailPortfolio(String clientId, String stockSymbol, int value) 
	{
		this.clientId = clientId;
		this.stockSymbol = stockSymbol;
		this.value = value;
	}
	public String getClientId() 
	{
		return clientId;
	}
	public String getStockSymbol() 
	{
		return stockSymbol;
	}
	public int getValue() 
	{
		return value;
	}

	
	
}
