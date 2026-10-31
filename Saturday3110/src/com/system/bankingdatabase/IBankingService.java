/*
 * Question 2: Java 9 private & private static Methods in Interface — Banking DB Connection (Total: 10 Marks)

Requirements (Choose your own names and data types):

Interface (IBankingService):

Declare 1 abstract method for basic account inquiry.

Write 2 default methods: one to transfer funds and one to book a Fixed Deposit (FD).

Write 1 private method inside the interface (e.g., connectToDatabase or checkMinimumBalance) and call it inside both 
default methods so the connection/check logic is written only once.

Write 1 private static method and call it inside a public static utility method in the same interface

Implementing Class (SbiAccount):
Implement the abstract method and call the default methods from the Driver class.
 */

package com.system.bankingdatabase;

public interface IBankingService {

	public abstract void basicAccountInquiry();
	
	default void transferFund(double amount)
	{
		connectToDataBase();
	}
	default void bookFixedDeposit() {
		connectToDataBase();
	}
	 
	private void connectToDataBase() 
	{
		System.out.println("succesfully conneted to data base.");
	}
	
	private static String termsCoditions() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Bank Name: State Bank Of India").append("\nBank has free upi service with no charges");
		return sb.toString();
	}
	public static String printReceipt(String userName, double amount, String accountNumber) 
	{
		
		StringBuilder sb = new StringBuilder();
		sb.append(IBankingService.termsCoditions());
		sb.append("\nUserName: ").append(userName).append("\nAmount: ").append(amount).append("\nAccount Number: ").append(accountNumber);
		return sb.toString();
	}
	
	
}
