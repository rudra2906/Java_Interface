package com.system.irctcpnrpassengersnapshot;

public class Ticket implements Cloneable {

	private String pnrNumber;
	private String passengerName;
	private int berthNumber;
	private double ticketFare;

	public Ticket(String pnrNumber, String passengerName, int berthNumber, double ticketFare) {
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.berthNumber = berthNumber;
		this.ticketFare = ticketFareValid(ticketFare);
	}

	private double ticketFareValid(double value) {
		if (value > 0) {
			return value;
		} else {
			System.out.println("Error found negative value");
			return 0;
		}
	}

	public String getPnrNumber() {
		return pnrNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public int getBerthNumber() {
		return berthNumber;
	}

	public double getTicketFare() {
		return ticketFare;
	}

	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public void setBerthNumber(int berthNumber) {
		this.berthNumber = berthNumber;
	}

	public void setTicketFare(double ticketFare) {
		this.ticketFare = ticketFareValid(ticketFare);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}
