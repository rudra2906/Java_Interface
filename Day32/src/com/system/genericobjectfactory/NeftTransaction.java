package com.system.genericobjectfactory;
/*
 * NeftTransaction: Attributes accountNumber, ifscCode, amount. Method printNeftReceipt.
 */
public class NeftTransaction {
	private String accountNumber;
	private String ifscCode;
	private double amount;
	public NeftTransaction(String accountNumber, String ifscCode, double amount) {
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.amount = checkNegative(amount);
	}
	private double checkNegative(double value) 
	{
		if(value>0) 
		{
			return value;
		}
		else {
			System.out.println("Please enter the correct amount");
			return 0.0;
		}
	}
	public String getAccountNumber(){
		return this.accountNumber;
	}
	public String getIfscCode() 
	{
		return this.ifscCode;
	}
	public double getAmount() 
	{
		return this.amount;
	}
	
	public void printNeftReceipt() 
	{
		System.out.println("Account Number: "+ this.getAccountNumber());
		System.out.println("Ifsc Code: "+ this.getIfscCode());
		System.out.println("Amount: "+ this.getAmount());
		
		
	}
	
	
}
