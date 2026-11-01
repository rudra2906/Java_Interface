package com.system.revision;

class Account
{
	public void accountOpen(String userName, int balance) 
	{
		System.out.println("Account open : "+ userName);
	}
}
public class SavingsAccount extends Account{

	public void accountOpen( int balance, String userName) 
	{
		System.out.println("Saving Account open : "+ userName);
	}
	public static void main(String[] args) {
		
		Account acc = new SavingsAccount();
		acc.accountOpen("Rudransh", 102);

	}

}
