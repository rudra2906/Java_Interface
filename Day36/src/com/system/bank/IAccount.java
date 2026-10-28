package com.system.bank;

public interface IAccount {

	//by default public abstract is there
	void displayDetails();
	
	void calculateInterest();
	
	public abstract void verificationDetails();
	
}
