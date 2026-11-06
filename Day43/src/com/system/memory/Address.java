package com.system.memory;

public class Address {

	private String name;
	private String mobileNumber;
	private String userId;

	public Address(String name, String mobileNumber, String userId) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
