package com.system.highwaytollmanagement;

import java.io.*;

public class TollSession implements Serializable {

	/**
	 * creating an toll session
	 */
	private static final long serialVersionUID = 1L;
	private String transactionId;
	private String registrationNumber;
	private double tollAmount;
	private transient String cardValidationKey;

	public TollSession(String transactionId, String registrationNumber, double tollAmount, String cardValidationKey) {
		this.transactionId = transactionId;
		this.registrationNumber = registrationNumber;
		this.tollAmount = tollAmount;
		this.cardValidationKey = cardValidationKey;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public double getTollAmount() {
		return tollAmount;
	}

	public String getCardValidationKey() {
		return cardValidationKey;
	}

}
