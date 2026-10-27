package com.system.SOLIDprinciple;

public class Payment {

	private String userName;
	public Payment(String userName) 
	{
		this.userName = userName;
	}
	
	public void displayDetails() 
	{
		System.out.println("UserName: "+ this.userName);
	}
	
}
