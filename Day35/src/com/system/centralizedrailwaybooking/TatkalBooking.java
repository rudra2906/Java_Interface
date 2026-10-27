/*
 * Attributes: tatkalPremiumRate

Behavior:

Constructor chains to super(...).

 */
package com.system.centralizedrailwaybooking;

public class TatkalBooking extends RailwayBooking {

	private double tatkalPremiumRate;

	public TatkalBooking(String pnrNumber, String trainNumber, String passengerName, double baseFare,
			String bookingStatus, double tatkalPremiumRate) {
		super(pnrNumber, trainNumber, passengerName, baseFare, bookingStatus);
		this.tatkalPremiumRate = checkNegative(tatkalPremiumRate, "TatkalBooking");
	}

	public TatkalBooking(String pnrNumber, String trainNumber, String passengerName, double baseFare,
			double tatkalPremiumRate) {
		super(pnrNumber, trainNumber, passengerName, baseFare);
		this.tatkalPremiumRate = tatkalPremiumRate;
	}

	public double getTatkalPremiumRate() {
		return tatkalPremiumRate;
	}

}
