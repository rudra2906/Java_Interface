package com.system.addressmutation;

public class Address implements Cloneable {

	private String flatNumber;
	private String streetName;
	private int pinCode;

	public Address(String flatNumber, String streetName, int pinCode) {
		this.flatNumber = flatNumber;
		this.streetName = streetName;
		this.pinCode = pinCode;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}
