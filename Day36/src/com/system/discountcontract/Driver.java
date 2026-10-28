package com.system.discountcontract;

public class Driver {

	public static void main(String[] args) {
		IDiscount discount = new FlightBooking("875187241", "AIR INDIA", 7890, 400, "flyhigh");
		System.out.println("Discount: "+ discount.calculateDiscount() );
		FlightBooking booking = (FlightBooking)discount;
		booking.claimFreeMealPass();
		System.out.println("Final amount: "+ (booking.getTicketFare() - booking.calculateDiscount()));
		
		IDiscount discount1 = new BusBooking("B213", "SHRRY", 890);
		System.out.println("Discount: "+ discount1.calculateDiscount() );
		BusBooking bookingbus = (BusBooking) discount1;
		System.out.println("Final Amount: " +(bookingbus.getSeatFare()-bookingbus.calculateDiscount()));
	
		IDiscount discount2 = new FlightBooking("875187241", new String("AIR INDIA"), 7890, 400, "flyhigh");
		FlightBooking booking2 = (FlightBooking)discount2;
		System.out.println(booking.getAirlineName() == booking2.getAirlineName());

		
	}

}

/*
 * IDiscount.FLAT_PROMO_OFF = 1000; --> this give compilation failure because of
 * in interface every attribute is by default final means constant because of
 * that we are not able to modify them
 */
