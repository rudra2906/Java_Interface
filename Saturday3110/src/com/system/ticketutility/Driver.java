/*
 * Driver Class:

Test both classes using the interface reference.

Add a 1-line comment showing what happens if you try to call the interface's static method using an object reference 
variable instead of the interface name.
 */

package com.system.ticketutility;

public class Driver {

	public static void main(String[] args) {

		IBooking booking = new TrainBooking("Rudransh", "Bhopal", "Banglore", 4000, "9781868168735");
		
		
		TrainBooking trainBooking = (TrainBooking) booking;
		//trainBooking.printTicket();
		booking.seatBooking();
		
		
		IBooking booking2 = new BusBooking("Rudransh", "Banglore", "bhopal", 5000, "9876418653241");
		BusBooking busBooking = (BusBooking) booking2;
		busBooking.seatBooking();
		busBooking.optingCarbonOffsetDonation("Rudransh");
	}
	
}
//booking.printTicket(); just like classes which is inherited by the subclasses and can be called using object reference 
//compiler will only give warning. in interface static method can not be inherit to sub class 