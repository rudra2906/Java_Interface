/*
 * 
Implementing Class (VandeBharatBooking implements ITatkalFareRule):

Attributes: pnrNumber, passengerName, govIdNumber (12-digit ID), distanceKm.

Core Functionality (Hidden):

maskGovId — uses StringBuilder to mask the first 8 digits of govIdNumber so only the last 4 digits are visible (e.g., "********4321").

Contract Implementation:

Must implement all 3 abstract methods inherited across IBaseFareRule and ITatkalFareRule.

generateTicketSummary — prints the ticket receipt with the masked ID and final Tatkal fare using StringBuilder.

Duplicate Booking Check (Object.equals):

Override equals(Object obj) using explicit downcasting so two VandeBharatBooking objects are considered equal if they share the same pnrNumber.

 */

package com.system.taxengine;

public class VandeBharatBooking implements ITatkalFareRule {

	private String pnrNumber;
	private String passengerName;
	private String govIdNumber;
	private double distanceKm;
	private String coachClass;
	private double occupacyPercentage;

	public VandeBharatBooking(String pnrNumber, String passengerName, String govIdNumber, double distanceKm,
			String coachClass, double occupacyPercentage) {
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.govIdNumber = govIdNumber;
		this.distanceKm = checkNegative(distanceKm);
		this.coachClass = coachClass;
		this.occupacyPercentage = occupacyPercentage;
	}

	private double checkNegative(double value) {
		if (value > 0) {
			return value;
		} else {
			System.out.println("[Error] value is negative.");
			return 0;
		}
	}

	public String getPnrNumber() {
		return pnrNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public String getGovIdNumber() {
		return maskGovId(govIdNumber);
	}

	public double getDistanceKm() {
		return distanceKm;
	}

	public double getOccupacyPercentage() {
		return occupacyPercentage;
	}

	public String getCoachClass() {
		return coachClass;
	}

	private String maskGovId(String value) {
		if (value.length() == 12) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < value.length() - 4; i++) {
				sb.append("*");
			}
			sb.append(value.substring(value.length() - 4));
			return sb.toString();
		} else {
			return "Government id is not valid";
		}
	}

	@Override
	public double calculateFare(double baseDistance) {
		double fareFinalAmount = this.distanceKm * 12;
		return fareFinalAmount;
	}

	@Override
	public double calculateFare(double baseDistance, String coachClass) {
		double fareFinalAmount = 0;
		if (coachClass != null) {
			if (coachClass.contains("1AC")) {
				return fareFinalAmount = baseDistance * 120;
			} else if (coachClass.contains("2AC")) {
				return fareFinalAmount = baseDistance * 100;
			} else if (coachClass.contains("3AC")) {
				return fareFinalAmount = baseDistance * 70;
			} else if (coachClass.contains("EC")) {
				return fareFinalAmount = baseDistance * 50;
			} else if (coachClass.contains("SL")) {
				return fareFinalAmount = baseDistance * 40;
			} else if (coachClass.contains("2S")) {
				return fareFinalAmount = baseDistance * 20;
			} else {

				return fareFinalAmount;
			}
		} else {
			System.out.println("Value is not available.");
			return calculateFare(baseDistance);
		}
	}

	@Override
	public double applyTatkalDynamicPricing() {
		double finalAmount = calculateFare(distanceKm, coachClass);
		if (this.getOccupacyPercentage() >= 75) {
			return finalAmount + ITatkalFareRule.TATKAL_MIN_SURGE;
		} else {
			return finalAmount + 200;
		}

	}

	public String generateTicketSummary() {
		StringBuilder sb = new StringBuilder();
		sb.append("--Ticket Receipt--").append("\nPnr Number : ").append(this.getPnrNumber())
				.append("\nPassenger Name: ").append(this.getPassengerName()).append("\nGovt. Id: ")
				.append(this.getGovIdNumber()).append("\nDistance: ").append(this.getDistanceKm());
		sb.append("\nFinal Tatkal price: ").append(this.calculateFare(distanceKm,coachClass));
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		VandeBharatBooking booking = (VandeBharatBooking) obj;
		if (booking.pnrNumber == null && this.pnrNumber == null) {
			return false;
		} else if (this.pnrNumber.equals(booking.pnrNumber) ) {
			return true;
		}
		return false;
	}
}

/*
 * In this program i have used the oops concept where encapsulation --> binding
 * the attribute with the behavior so that other class can not modify data
 * directly they can access data with some rules the encapsulation can be
 * achieved by using the access modifiers along with getter and setter where
 * getter returns the data which is not directly accessible by any other class
 * and setter is use to set the value of attribute with control manner
 * 
 * inheritance --> derived class inherit the property of parent class is know as
 * inheritance inheritance can be done by using the extends keyword by child
 * class child class can use the same behavior or parent class or they can
 * override the parent class behavior this help in code reusability, and
 * maintainability
 * 
 * 
 * 
 */
