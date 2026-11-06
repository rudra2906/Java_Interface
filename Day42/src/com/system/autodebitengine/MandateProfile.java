package com.system.autodebitengine;

import java.io.Serializable;

public class MandateProfile implements Serializable {

	private static final long serialVersionUID = 1L;
	private String userId;
	private String upiHandle;
	private double maximumLimitAmount;
	private transient String userToken;

	public MandateProfile(String userId, String upiHandle, double maximumLimitAmount, String userToken) {
		this.userId = userId;
		this.upiHandle = upiHandle;
		this.maximumLimitAmount = maximumLimitAmount;
		this.userToken = userToken;

	}

	public String getUserId() {
		return userId;
	}

	public String getUpiHandle() {
		return upiHandle;
	}

	public double getMaximumLimitAmount() {
		return maximumLimitAmount;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUpiHandle(String value) {
		this.upiHandle = value;
	}

	public void setMaximumLimitAmount(double value) {
		this.maximumLimitAmount = value;
	}

	public void setUserToken(String value) {
		this.userToken = value;
	}

}
