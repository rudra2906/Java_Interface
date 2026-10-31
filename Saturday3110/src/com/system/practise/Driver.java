package com.system.practise;

public class Driver {

	public static void main(String[] args) {
		IBooking book = new TicketBooking();
		book.print();
		
		TicketBooking book1 = new TicketBooking();
		book1.print();
	}
	
}
