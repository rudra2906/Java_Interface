package com.system.genericobjectfactory;

public class Driver {

	public static void main(String[] args) {
		
		BankingObjectFactory b1 = new BankingObjectFactory("UPI");
		Object ob = b1.getTransactionObject();
		
		//downcast
		UpiTransaction u = (UpiTransaction) ob;
		System.out.println(u.getAmount());
		
		
		BankingObjectFactory b2 = new BankingObjectFactory("NEFT");
		Object ob1 = b2.getTransactionObject();
		//downcaste
		NeftTransaction n = (NeftTransaction) ob1;
		System.out.println(n.getAccountNumber());

		//downcaste
		UpiTransaction u32 = (UpiTransaction) ob1;
	}

}

/*
 * Call getTransactionObject("UPI"), store the returned reference, and
 *  downcast it to UpiTransaction to call printUpiReceipt.
Call getTransactionObject("NEFT"), downcast it to NeftTransaction, and call printNeftReceipt.
Write a commented-out line showing what happens if you downcast the "UPI" object to
 NeftTransaction (ClassCastException at runtime) and explain why.
 */
