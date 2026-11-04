package com.system.zomato;

public class Order implements Cloneable{

	private String name;
	private String userId;
	private double walletPoints;
	
	public Address address;

	public Order(String name, String userId, double walletPoints, Address address) {
		this.name = name;
		this.userId = userId;
		this.walletPoints = walletPoints;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
		
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String getUserId()
	{
		return userId;
	}
	public double getWalletPoints() 
	{
		return walletPoints;
	}
	public Address getAddress()
	{
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setWalletPoints(double walletPoints) {
		this.walletPoints = walletPoints;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
