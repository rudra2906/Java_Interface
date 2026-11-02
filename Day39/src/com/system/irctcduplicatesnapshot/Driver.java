package com.system.irctcduplicatesnapshot;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		TicketBooking booking = new TicketBooking("68416853", "Rudransh", "S23", 1100);
		
//		TicketBooking bookingClone = (TicketBooking)booking.clone();
//		
//		System.out.println(bookingClone.displayTicket());

		if( booking instanceof ITrainTicket ) 
		{
			System.out.println("Instance of cloneable.");
		}
		else 
		{
			System.out.println("not an instance of ");
		}
	}

}
