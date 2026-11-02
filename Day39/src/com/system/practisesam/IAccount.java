package com.system.practisesam;

@FunctionalInterface
public interface IAccount {

	String openAccount(String customerName, String branch, double intitalDeposit);
	
	default void deposit() 
	{
		System.out.println("Deposited");
	}
	static void printStatement(String customerName, String branch){
		
		System.out.println("Customer Name: "+ customerName);
		System.out.println("Branch: "+branch);
	}
	
}
