package com.system.revision;


class SwiggyOrder
{
	 public void openAccount(String name, int initialDeposit) {
	        System.out.println("Account opened for " + name);
	    }
}
class CheckOutOrder extends SwiggyOrder{

	public void openAccount(int initialDeposit, String name) {
	    System.out.println("Account opened for " + name);
	}
}
public class PractiseInheritance extends SwiggyOrder{
	public void openAccount(int initialDeposit, String name) {
	    System.out.println("Account opened for " + name);
	}
	public static void main(String[] args) {
		SwiggyOrder order = new PractiseInheritance();
		//order.openAccount( 100,"rudy");
	}
}
