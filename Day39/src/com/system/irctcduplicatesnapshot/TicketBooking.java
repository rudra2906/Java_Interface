package com.system.irctcduplicatesnapshot;

public class TicketBooking implements ITrainTicket {// giving permission so that object of this class can be cloned
	// by using the marker interface --> which do not contains any method they are
	// special interface which grant permission

	private String pnrNumber;
	private String passengerName;
	private String berthCode;
	private double fare;

	public TicketBooking(String pnrNumber, String passengerName, String berthCode, double fare) {
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.berthCode = berthCode;
		this.fare = fare;
	}
	public String displayTicket() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pnr Number: ").append(pnrNumber).append("Passenger Name: ").append(passengerName);
		sb.append("BerthCode: ").append(berthCode).append("Fare: ").append(fare);
		return sb.toString();
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}



}
