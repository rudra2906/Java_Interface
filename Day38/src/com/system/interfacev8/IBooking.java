package com.system.interfacev8;

public interface IBooking {

	//abstract method 
	void userDetails();
	void verification();
	void couponCode();
	
	private boolean connectToDB() {
		return true;
	}
	public default void autoUpgrade() 
	{
		connectToDB();
		System.out.println("IBooking.autoUpgrade()");
		printTicket();
	}
	public default void cancellation() 
	{
		connectToDB();
		System.out.println("IBooking.cancellation()");
	}
	
	public static void printTicket() 
	{
		System.out.println("IBooking.printTicket()");
	}
	
	
}
