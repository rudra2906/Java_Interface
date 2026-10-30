/*
 * Driver Class:

Test both classes using an IBooking reference.

Add 1 commented-out line showing what happens if you try to call bookingRef.printTicket(...) using the reference variable instead of the interface name

 */
package com.system.travelticketprinter;

public class Driver {
	
	public static void main(String[] args) {
		IBooking booking = new FlightBooking("Rudransh","Banglore","Bhopal",10,"HAPPY99"); 
		booking.bookTicket();
		
//		booking.printTicket("Rudransh","Banglore","Bhopal",10);
		
		IBooking trainBooking = new TrainBooking("Rudransh", "Banglore", "Ladakh", 50);
		trainBooking.bookTicket();
		
		FlightBooking flightbooking = (FlightBooking)booking;
		System.out.println(flightbooking.getName());
		
	}
	
}





/*
*FlightBooking flightbooking = (FlightBooking)trainooking; then ill get the class caste exception at compile time ill compile successfully 
*as flightBooking and TrainBooking is implementing the IBooking but at run time ill give exception 
*
*	booking.printTicket("Rudransh","Banglore","Bhopal",10);
*	This static method of interface IBooking can only be accessed as IBooking.printTicket 
*	In interface we cannot create the object so it cannot be accessed by the object refrence 
*	 
*
*  Interface is a blueprint of class. It is a contract which tell what to do wont tell how to do 
*  it is implemented by classes by using the implements keyword
* 
*/
