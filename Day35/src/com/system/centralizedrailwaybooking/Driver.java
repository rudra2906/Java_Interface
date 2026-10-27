/*
 * Driver Requirements:

Instantiate two separate RailwayBooking objects with identical pnrNumber and trainNumber but different 
heap references. Compare them using == and .equals() to verify address comparison vs content comparison.

Instantiate a PremiumTatkalBooking object and verify through console logs the execution sequence of SIB, 
IIB, and constructors across all 3 levels.

Demonstrate access modifier widening: verify that calculatePayableFare() can now be accessed publicly 
from any package on a TatkalBooking or PremiumTatkalBooking reference.

 */
package com.system.centralizedrailwaybooking;

public class Driver {

	public static void main(String[] args) {
		
		RailwayBooking booking = new RailwayBooking("8770400437", "12345", "Rudransh", 5000);
		RailwayBooking booking1 = new RailwayBooking(new String("8770400437"), new String("12345"), "Rudransh", 5000);

		System.out.println(booking.getPnrNumber() == booking1.getPnrNumber()); //false
		System.out.println(booking.getPnrNumber().equals(booking1.getPnrNumber())); // true
		
		
		PremiumtTatkalBooking tatkalBooking = new PremiumtTatkalBooking("8770400437", "12345", "rudy", 6000, 5);
		System.out.println(PremiumtTatkalBooking.getMaxAdvanceBookingDays());
		System.out.println(PremiumtTatkalBooking.getRailwayZoneCode());
		System.out.println(tatkalBooking.getBookingStatus());
	}

}
