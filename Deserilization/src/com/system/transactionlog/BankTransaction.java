package com.system.transactionlog;

import java.io.Serializable;

public class BankTransaction implements Serializable{

	/*
	 * de-serilization
	 * serialVersionUID --> at the time of de-serilization uid is compared if it was not matched then
	 * it'll give the exception of InvalidClassException 
	 * 
	 *  also we will be getting null value in pin because used a keyword transient to ignore pin
	 *  data at the time of compilation 
	 */
	private static final long serialVersionUID = 1L;
	private String transactionId;
	private String accountHolderName;
	private double transferredAmount;
	private transient String pin;

	public BankTransaction(String transactionId, String accountHolderName, double transferredAmount, String pin) {
		this.transactionId = transactionId;
		this.accountHolderName = accountHolderName;
		this.transferredAmount = transferredAmount;
		this.pin = pin;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getTransferredAmount() {
		return transferredAmount;
	}

	public String printDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("Transaction Id: ").append(transactionId).append(" Account Holder Name: ").append(accountHolderName)
				.append(" Transferred Amount: ").append(transferredAmount);
		return sb.toString();
	}

}
