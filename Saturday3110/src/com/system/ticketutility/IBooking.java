/*
 * Booking Interface:

Define a constant for the platform convenience fee.

Declare 1 abstract method to confirm a seat booking (do not explicitly type public abstract—let the compiler insert them).

Write 1 default method for opting into a carbon-offset donation.

Write 1 static utility method that accepts passenger details and fare, and prints a formatted ticket summary.
 */

package com.system.ticketutility;

public interface IBooking {

	double PLATFORM_CONVENIENCE_FEE = 17.0;

	void seatBooking();

	default void optingCarbonOffsetDonation(String userName) {
		System.out.println(userName + "Thankyou for the donation.");
	}

	public static String printTicket(String passengerName, double fare, String source, String destination,
			String pnrNumber) {

		StringBuilder sb = new StringBuilder();
		sb.append("Passenger Name: ").append(passengerName).append("\nSource: ").append(source)
				.append("\nDestination: ").append(destination).append("\nPnr Number: ").append(pnrNumber);
		return sb.toString();
	}

}
