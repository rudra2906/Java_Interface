package com.system.mmt;

public class Driver {

	public static void main(String[] args) {
		
		IBooking booking = new TrainTicketBooking();
		// interface --> v8 --> backward compatability
		booking.autoUpgradation();

	}
}	
