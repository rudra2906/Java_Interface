package com.system.mmt;

public class BusBooking implements IBooking {

	@Override
	public void validateUser() {
		System.out.println("BusBooking.validateUser()");

	}

	@Override
	public void booking() {
		System.out.println("BusBooking.booking()");

	}

	@Override
	public void bookingStatus() {
		System.out.println("BusBooking.bookingStatus()");

	}

	@Override
	public void generateTicket() {
		System.out.println("BusBooking.generateTicket()");

	}

}
