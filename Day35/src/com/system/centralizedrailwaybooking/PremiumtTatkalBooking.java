/*
 * Level 3 Derived Class — PremiumTatkalBooking (Extends TatkalBooking):

Attributes: dynamicSurgeMultiplier

Behavior:

Constructor chains through super(...).

Override calculatePayableFare(): Multiplies the Tatkal fare by the dynamic surge rate.

 */
package com.system.centralizedrailwaybooking;

public class PremiumtTatkalBooking extends RailwayBooking {

	private double dynamicSurgeMultiplier;

	public PremiumtTatkalBooking(String pnrNumber, String trainNumber, String passengerName, double baseFare,
			String bookingStatus, double dynamicSurgeMultiplier) {
		super(pnrNumber, trainNumber, passengerName, baseFare, bookingStatus);
		this.dynamicSurgeMultiplier = dynamicSurgeMultiplier;
	}

	public PremiumtTatkalBooking(String pnrNumber, String trainNumber, String passengerName, double baseFare,
			double dynamicSurgeMultiplier) {
		super(pnrNumber, trainNumber, passengerName, baseFare);
		this.dynamicSurgeMultiplier = dynamicSurgeMultiplier;

	}

	public double getDynamicSurgeMultiplier() {
		return dynamicSurgeMultiplier;
	}

	@Override
	protected double calculatePayableFare() {
		return super.calculatePayableFare() * this.getDynamicSurgeMultiplier();
	}

}
