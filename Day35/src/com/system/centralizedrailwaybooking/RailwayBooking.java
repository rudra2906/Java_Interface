/*
 * Level 1 Base Class — RailwayBooking:

Static Members: railwayZoneCode, maxAdvanceBookingDays

Instance Members: pnrNumber, trainNumber, passengerName, baseFare, bookingStatus

Class Lifecycle:

Use a Static Initialization Block (SIB) to initialize railwayZoneCode ("IR-CENTRAL") and maxAdvanceBookingDays (120), logging a startup configuration string.

Use an Instance Initialization Block (IIB) to automatically assign bookingStatus as "INITIATED" and generate an internal timestamp before any constructor body executes.

Constructors (Constructor Chaining via this(...)):

Constructor 1: Accepts pnrNumber, trainNumber, passengerName, and baseFare. Chains to Constructor 2.

Constructor 2: Accepts all fields plus an explicit status if overriding default behavior.

Behavior:

calculatePayableFare(): Defined with protected access; returns baseFare.

Override public boolean equals(Object obj): Downcast Object to RailwayBooking and check whether both pnrNumber and trainNumber match.

 */

package com.system.centralizedrailwaybooking;

import java.time.*;

public class RailwayBooking {

	private static String railwayZoneCode;
	private static int maxAdvanceBookingDays;

	private String pnrNumber;
	private String trainNumber;
	private String passengerName;
	private double baseFare;
	private String bookingStatus;

	static {
		RailwayBooking.railwayZoneCode = "IR-CENTRAL";
		RailwayBooking.maxAdvanceBookingDays = 120;
		System.out.println("Indian Railways Welcome's You...");
	}

	{
		this.bookingStatus = "INITIATED";
		System.out.println(Instant.now());
	}

	// Constructor 1: Accepts pnrNumber, trainNumber, passengerName, and baseFare.
	// Chains to Constructor 2.
	public RailwayBooking(String pnrNumber, String trainNumber, String passengerName, double baseFare) {
		this(pnrNumber, trainNumber, passengerName, baseFare, "INITIATED");
	}

	// Constructor 2: Accepts all fields plus an explicit status if overriding
	// default behavior.
	public RailwayBooking(String pnrNumber, String trainNumber, String passengerName, double baseFare,
			String bookingStatus) {
		this.pnrNumber = pnrNumber;
		this.trainNumber = trainNumber;
		this.passengerName = passengerName;
		this.baseFare = checkNegative(baseFare, "RailwayBooking");
		this.bookingStatus = bookingStatus;
	}

	protected double checkNegative(double value, String className) {
		if (value > 0) {
			return value;
		} else {
			System.out.println("[Error] check the value, setting it to negative in %s" + className);
			return 0;
		}
	}

	public static String getRailwayZoneCode() {
		return railwayZoneCode;
	}

	public static int getMaxAdvanceBookingDays() {
		return maxAdvanceBookingDays;
	}

	public String getPnrNumber() {
		return pnrNumber;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public double getBaseFare() {
		return baseFare;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	protected double calculatePayableFare() {
		return this.getBaseFare();
	}

	// Override public boolean equals(Object obj): Downcast Object to RailwayBooking
	// and check whether both pnrNumber and trainNumber match.

	@Override
	public boolean equals(Object obj) {
		RailwayBooking booking = (RailwayBooking) obj;

		if (this.trainNumber == null) {
			return false;
		}
		if (this.pnrNumber == null) {
			return false;
		}
		if (booking.pnrNumber == null || booking.trainNumber == null) {
			return false;
		}
		if (booking.pnrNumber.equals(this.pnrNumber) && booking.trainNumber.equals(this.trainNumber)) {
			return true;
		}
		return false;
	}
}
