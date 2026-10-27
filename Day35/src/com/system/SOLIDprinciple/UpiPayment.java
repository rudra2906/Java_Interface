package com.system.SOLIDprinciple;

public class UpiPayment extends Payment {

	private String upiId;
	public UpiPayment(String name, String upiId) 
	{
		super(name);
		this.upiId = checkValidUpiId(upiId);
	}
	private String checkValidUpiId(String value) 
	{
		if( value.contains("@") ) 
		{
			return value;
		}
		else 
		{
			System.out.println("[Error] not correct upi id.");
			return "Not valid";
		}
	}
	@Override
	public void displayDetails() 
	{
		super.displayDetails();
		System.out.println("Upi Id: "+ this.upiId);
	}
}
