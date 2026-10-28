package com.system.discountcontract;

public class BusBooking implements IDiscount {

	private String ticketId;
	private String busOperator;
	private double seatFare;

	public BusBooking(String ticketId, String busOperator, double seatFare) {
		this.ticketId = ticketId;
		this.busOperator = busOperator;
		this.seatFare = checkNegative(seatFare);
	}

	private double checkNegative(double value) {
		if (value > 0) {
			return value;
		} else {
			System.out.println("[Error]");
			return 0;
		}
	}

	@Override
	public double calculateDiscount() {
		double discount = 0;
		if (seatFare > 500) {
			discount = IDiscount.FLAT_PROMO_OFF;
			return discount;
		}
		return 0;
	}

	@Override
	public double calcualteDiscountOnTax() {
		return 0;
	}

	public String getTicketId() {
		return ticketId;
	}

	public String getBusOperator() {
		return busOperator;
	}

	public double getSeatFare() {
		return seatFare;
	}

}
