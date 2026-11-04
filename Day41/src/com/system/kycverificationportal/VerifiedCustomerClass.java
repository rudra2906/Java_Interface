package com.system.kycverificationportal;

public class VerifiedCustomerClass implements IKycVerification {

	private String customerId;
	private String fullName;
	private String panNumber;

	public VerifiedCustomerClass(String customerId, String fullName, String panNumber) {
		this.customerId = customerId;
		this.fullName = fullName;
		this.panNumber = panNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public String getPanNumber() {
		return panNumber;
	}

}
