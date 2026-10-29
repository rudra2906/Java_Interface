package com.system.mmt;

public class TrainTicketBooking implements IBooking {

	@Override
	public void validateUser() {
		System.out.println("TrainTicketBooking.validateUser()");

	}

	@Override
	public void booking() {
		System.out.println("TrainTicketBooking.booking()");
	}

	@Override
	public void bookingStatus() {
		System.out.println("TrainTicketBooking.bookingStatus()");

	}

	@Override
	public void generateTicket() {
		System.out.println("TrainTicketBooking.generateTicket()");

	}
	
	@Override
	public void autoUpgradation() {
		System.out.println("TrainTicketBooking.autoUpgradation()");
	}

}
