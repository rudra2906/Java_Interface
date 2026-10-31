/*
 * Implementing Class (SbiAccount):
Implement the abstract method and call the default methods from the Driver class.
 */
package com.system.bankingdatabase;

public class SbiAccount implements IBankingService {

	private String userName;
	private double balance;
	private String accountNumber;

	public SbiAccount(String userName, double balance, String accountNumber) {
		this.userName = userName;
		this.balance = checkNegative(balance);
		this.accountNumber = accountNumber;
	}

	private double checkNegative(double value) {
		if (value > 0) {
			return value;
		} else {
			System.out.println("[Error] value is negative");
			return 0;
		}
	}

	@Override
	public void transferFund(double amount) 
	{
		IBankingService.super.transferFund(amount);
		if( amount>0 && amount<=this.balance ) 
		{
			balance -= amount;
		}
	}
	
	@Override
	public void basicAccountInquiry() {
		
		System.out.println(IBankingService.printReceipt(this.userName, this.balance, this.accountNumber));
		
	}

}
