/*
 * Both implement the booking method and call the interface's static ticket printer inside it.

Override the default carbon-offset method only in the Train Booking class, leaving the Bus Booking class untouched to
 prove backward compatibility.
 */
package com.system.ticketutility;

public class TrainBooking implements IBooking {

	private String userName;
	private String source;
	private String destination;
	private double fare;
	private String pnrNumber;
	private boolean isSeatAvailable;

	public TrainBooking(String userName, String source, String destination, double fare, String pnrNumber) {
		this.userName = userName;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.pnrNumber = pnrNumber;
		this.isSeatAvailable = true;
	}

	public String getUserName() {
		return userName;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public double getFare() {
		return fare;
	}

	private void changeSeatAvailability(boolean value) {
		this.isSeatAvailable = value;
	}

	@Override
	public void optingCarbonOffsetDonation(String userName) {

		IBooking.super.optingCarbonOffsetDonation(userName);
		System.out.println(IBooking.printTicket(userName, fare, source, destination, pnrNumber));
		System.out.println("Final Fare is: " + (fare + IBooking.PLATFORM_CONVENIENCE_FEE - unlockFlatHundered()));

	}

	private double unlockFlatHundered() {
		if (fare > 100) {
			return 100;
		} else {
			return 0;
		}
	}

	@Override
	public void seatBooking() {

		if (isSeatAvailable) {
			System.out.println("Congrats on TrainBooking");
			System.out.println(IBooking.printTicket(userName, fare, source, destination, pnrNumber));
			System.out.println("Final Fare is: " + fare + IBooking.PLATFORM_CONVENIENCE_FEE);
		} else {
			System.out.println("Seat Not available.");
		}

	}

}
