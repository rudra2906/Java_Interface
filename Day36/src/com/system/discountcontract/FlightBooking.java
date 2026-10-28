/*
 * mplementing Class 1 (FlightBooking implements IDiscount):

Attributes: pnrNumber, airlineName, ticketFare, taxAmount (Normalize airlineName in the String Constant Pool since thousands of passengers fly "INDIGO" or "AIRINDIA").

Core Functionality (Hidden):

verifyPromoEligibility — checks if the ticket fare is above 3000 before allowing any promo discount.

Contract Implementation ("How" part):

calculateDiscount — calls verifyPromoEligibility; if eligible and promo matches "FLYHIGH", deducts 15% from the booking amount plus IDiscount.FLAT_PROMO_OFF.

calculateDiscountOnTax — gives a 10% discount on tax, but ensures the discount never exceeds IDiscount.MAX_TAX_DISCOUNT.

Class-Specific Method (Not in IDiscount):

claimFreeMealPass — prints confirmation of a complimentary in-flight meal.
 */

package com.system.discountcontract;

public class FlightBooking implements IDiscount {

	private String pnrNumber;
	private String airlineName;
	private double ticketFare;
	private double taxAmount;
	private String promoCode;

	public FlightBooking(String pnrNumber, String airlineName, double ticketFare, double taxAmount, String promoCode) {
		this.pnrNumber = pnrNumber;
		this.airlineName = airlineName.intern();
		this.ticketFare = checkNegative(ticketFare);
		this.taxAmount = checkNegative(taxAmount);
		this.promoCode = promoCode;
	}

	private double checkNegative(double value) {
		if (value > 0) {
			return value;
		} else {
			System.out.println("[Error]");
			return 0;
		}
	}

	public String getPnrNumber() {
		return pnrNumber;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public double getTicketFare() {
		return ticketFare;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	private boolean verifyPromoEligibility() {
		if (this.getTicketFare() > 3000) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double calculateDiscount() {
		double discountAmount = 0;
		if (this.verifyPromoEligibility() && "FLYHIGH".equalsIgnoreCase(promoCode)) {
			discountAmount = (this.getTicketFare() * 0.15) + IDiscount.FLAT_PROMO_OFF;
			return discountAmount;
		} else {
			return discountAmount;
		}
	}

	public void claimFreeMealPass() {
		System.out.println("You will get complimentary meal");
	}

	@Override
	public double calcualteDiscountOnTax() {
		double taxDiscount = 0;
		if (IDiscount.MAX_TAX_DISCOUNT <= this.getTaxAmount() * 0.10) {
			taxDiscount = this.getTaxAmount() * 0.10;
			return taxDiscount;
		}
		return taxDiscount;
	}

}
