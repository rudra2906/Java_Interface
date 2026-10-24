package com.system.genericobjectfactory;

/*
 * UpiTransaction: Attributes upiId, amount. Method printUpiReceipt.
 */
public class UpiTransaction {

	private String upiId;
	private double amount;

	public UpiTransaction(String upiId, double amount) {
		this.upiId = upiId;
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
	public String getUpiId() {
		return this.upiId;
	}

	public double getAmount() {
		return this.amount;
	}

	public void printUpiReceipt() {
		System.out.println("UPI ID: " + this.getUpiId());
		System.out.println("Amount: " + this.getAmount());
	}

}
