package com.system.IRCTCduplicateticketcheck;

/*
 * Class (IrctcPassenger):

Attributes: passengerName, aadhaarNumber, age, seatCoach


Behavior:

Override public boolean equals(Object obj) from java.lang.Object.

Inside equals(Object obj), perform explicit downcasting from Object to IrctcPassenger and 
compare both passengerName and aadhaarNumber.
 */
public class IrctcPassenger {

	private String passengerName;
	private String aadhaarNumber;
	private int age;
	private String seatCoach;

	public IrctcPassenger(String passengerName, String aadhaarNumber, int age, String seatCoach) {
		this.passengerName = passengerName;
		this.aadhaarNumber = aadhaarNumber;
		this.age = age;
		this.seatCoach = seatCoach;
	}

	public String getPassengerName() {
		return this.passengerName;
	}

	public String getAadhaarNumber() {
		return this.aadhaarNumber;
	}

	public int getAge() {
		return this.age;
	}

	public String getSeatCoach() {
		return this.seatCoach;
	}

	@Override
	public boolean equals(Object ob) {
		IrctcPassenger passenger = (IrctcPassenger) ob;
		if (passenger.getPassengerName().equals(this.getPassengerName())
				&& passenger.getAadhaarNumber().equals(this.getAadhaarNumber())) {
			return true;
		}

		return false;
	}
}
