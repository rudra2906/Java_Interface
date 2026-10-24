package com.system.bookmyshow;

public class BookMyShowFactory {

	// overload
//	public Object getBookingObject(String bookingCategory, String movieTitle, String seatNumber, double ticketPrice) {
//		return new MovieTicket(movieTitle, seatNumber, ticketPrice);
//	}
//
//	public Object getBookingObject(String artistName, String arenaZone, double passFee) {
//		return new LiveConcertPass(artistName, arenaZone, passFee);
//	}

	// by case 2
	public Object getBookingObject(String bookingCategory, String titleOrName, String seatNumberOrArenaZone,
			double ticketPriceOrPassFees) {

		if (bookingCategory.equalsIgnoreCase("MOVIE")) {
			return new MovieTicket(titleOrName, seatNumberOrArenaZone, ticketPriceOrPassFees);
		} else if (bookingCategory.equalsIgnoreCase("CONCERT")) {
			return new LiveConcertPass(titleOrName, seatNumberOrArenaZone, ticketPriceOrPassFees);
		}
		return null;
	}

}

/*
 * method overloading --> allow multiple method with same name different
 * functionality with in a same class is also know as compile time polymorphism.
 * there is no such rule in method overloading but method signature should be
 * different like either order, either data type, either number of argument
 */
