package com.system.interfacev8;

public class Driver {

	public static void main(String[] args) {
		IBooking booking = new BusBookig();
		
		BusBookig booking1 = (BusBookig)booking;
		
		booking1.printTicket();
	}
	
}

class CouponCode extends BusBookig implements IBooking
{
	
}