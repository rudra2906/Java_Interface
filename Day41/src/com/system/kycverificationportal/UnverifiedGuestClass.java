package com.system.kycverificationportal;

public class UnverifiedGuestClass{

	private String sessionId;
	private String temporaryMobileNumber;
	public UnverifiedGuestClass(String sessionId, String temporaryMobileNumber) {
		this.sessionId = sessionId;
		this.temporaryMobileNumber = temporaryMobileNumber;
	}
	public String getSessionId() {
		return sessionId;
	}
	public String getTemporaryMobileNumber() {
		return temporaryMobileNumber;
	}	
	
}
