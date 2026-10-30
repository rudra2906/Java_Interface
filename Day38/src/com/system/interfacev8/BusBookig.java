package com.system.interfacev8;

public class BusBookig implements IBooking{

	@Override
	public void userDetails() {
		System.out.println("BusBookig.userDetails()");
		
	}

	@Override
	public void verification() {
		System.out.println("BusBookig.verification()");
		
	}

	@Override
	public void couponCode() {
		System.out.println("BusBookig.couponCode()");
		
		
	}
	
	public static void printTicket() 
	{
		System.out.println("BusBookig.printTicket( IBooking.printTicket(); )");
		IBooking.printTicket();
		System.out.println("BusBookig.printTicket()");
	}

}
