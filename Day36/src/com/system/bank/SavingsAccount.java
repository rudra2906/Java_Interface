package com.system.bank;

public class SavingsAccount extends Object implements IAccount{

	@Override
	public void displayDetails() {
		System.out.println("SavingsAccount.displayDetails()");
		
	}

	@Override
	public void calculateInterest() {
		System.out.println("SavingsAccount.calculateInterest()");
		
	}

	@Override
	public void verificationDetails() {
		System.out.println("SavingsAccount.verificationDetails()");
		
	}

	
	
}
