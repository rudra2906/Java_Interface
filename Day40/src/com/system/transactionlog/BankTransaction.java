package com.system.transactionlog;

import java.io.Serializable;

public class BankTransaction implements Serializable {

	/*
	 * Serializable --> it is a marker interface/tag interface which is implemented by classes to give the permission
	 * for serilization if we will not use then we will get the exceptions NotSerializableException at run time. means other 
	 * classes can not do serilization --> the process of converting process state to byte stream 
	 * which can be shared inside the file and can be shared across network
	 * 
	 * transient --> is a keyword which is used to prevent data from serialization. if data
	 * is private and class do not want to serilize it then by using transient keyword skip the 
	 * process
	 *  
	 * serialVersionUID --> it is a unique id constant which was used to compare at the time of de-serialization
	 * if we will not add UID then java will add it automatically at the time of serialization 
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
		sb.append("Transaction Id: ").append(transactionId).append("Account Holder Name: ").append(accountHolderName)
				.append("Transferred Amount: ").append(transferredAmount);
		return sb.toString();
	}

}
