package com.system.SOLIDprinciple;

public class CardPayment extends Payment{

	private String cardNumber;
	public CardPayment(String name,String cardNumber) {
		super(name);
		this.cardNumber = cardNumber;
	}
	@Override
	public void displayDetails() 
	{
		super.displayDetails();
		System.out.println("CardNumber: "+ this.cardNumber);
	}
}
