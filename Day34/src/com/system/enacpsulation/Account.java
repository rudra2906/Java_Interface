package com.system.enacpsulation;

public class Account {

	private double amount;
	private String pin;
	
	Account(double amount, String pin)
	{
		this.amount = checkNegative(amount);
		//this.pin = 
	}
	
	
	public double getAmount() {
		return amount;
	}

	public String setPin(String pin) {
		if( this.pin==null && this.pin.length()>=4) 
		{
			return pin;
		}
		else 
		{
			return "Not Valid";
		}
		
	}
	private double checkNegative(double value) 
	{
		if(value>0 ) 
		{
			return value;
		}
		else 
		{
			return 0;
		}
	}



	public void setAmount(double amount) 
	{
		if( amount >0) 
		{
			this.amount += amount;
		}
	}
}
