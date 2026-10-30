/*
 * Implementing Classes (FlightBooking and TrainBooking):

Implement the abstract booking method.

Inside the booking method, call the interface's static printTicket method using the interface name (IBooking.printTicket(...)).

 */

package com.system.travelticketprinter;

public class FlightBooking implements IBooking {

	private String name;
	private String source;
	private String destination;
	private double distanceKm;
	private String couponCode;

	public FlightBooking(String name, String source, String destination, double distanceKm, String couponCode) {
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.distanceKm = checkNegative(distanceKm);
		this.couponCode = checkCouponCode(couponCode);
	}

	private String checkCouponCode(String value) {
		if (value == null) {
			return "Not valid";
		} else {
			return value;
		}
	}

	private double checkNegative(double value) {
		if (value > 0) {
			return value;
		} else {
			System.out.println("Your value is negative setting it to zero");
			return 0;
		}
	}

	public String getName() {
		return name;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public double getDistanceKm() {
		return distanceKm;
	}

	public String getCouponCode() {
		return couponCode;
	}

	private boolean evaluateCouponCode(String couponCode) {
		if ("HAPPY99".equalsIgnoreCase(couponCode)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void bookTicket() {

		if (evaluateCouponCode(couponCode)) {
			double couponAmount = 99;
			double fare = (this.getDistanceKm() * 50) - couponAmount;
			System.out.println(IBooking.printTicket(this.getName(), this.getSource(), this.getDestination(), fare));
		} else {
			double fare = (this.getDistanceKm() * 50);
			System.out.println(IBooking.printTicket(this.getName(), this.getSource(), this.getDestination(), fare));
		}

	}

}
