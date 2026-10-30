/*
 * Requirements (Choose your own names and data types):

Interface (IBooking):

Declare 1 abstract method to book a ticket.

Write 1 static method printTicket that accepts passenger name, source, destination, and fare, and prints a formatted ticket receipt.

Implementing Classes (FlightBooking and TrainBooking):

Implement the abstract booking method.

Inside the booking method, call the interface's static printTicket method using the interface name (IBooking.printTicket(...)).

Driver Class:

Test both classes using an IBooking reference.

Add 1 commented-out line showing what happens if you try to call bookingRef.printTicket(...) using the reference variable instead of the interface name

*/

package com.system.travelticketprinter;

public interface IBooking {

	void bookTicket();
	
	public static String printTicket(String name, String source, String destination , double fare) 
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("<-- Your ticket is booked -->").append("\nName: ").append(name).append("\nSource: ").append(source).append("\nDestination: ").append(destination).append("\nFare: ").append(fare);
		return sb.toString();
	}
	
}
